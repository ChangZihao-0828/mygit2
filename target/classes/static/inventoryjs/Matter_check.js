layui.use(['table','layer','jquery'], function(){
    var table = layui.table;
    var layer = layui.layer;
    var $ = layui.$;
    //第一个实例
    table.render({
        elem: '#demo'
        ,url: '/matterCheck' //数据接口
        ,page: true //开启分页
        ,limit:5 //默认每一页显示的条数
        ,limits:[1,2,3,5,10,20,30,50]//提示的每页条数的列表
        ,toolbar:"#addDemo" //显示工具栏
        ,title:"物料检查记录汇总" //设置导出文件时的标题
        ,loading:true
        ,cols: [[ //表头
            {field: 'matterCheckId', title: '物料检查单编号', width:"10%", sort: true, fixed: 'left',align:"center"}
            ,{field: 'warehousePositionId', title: '仓位编号', width:"10%", sort: true,align:"center"}
            ,{field: 'matterCheckUserId', title: '检查人', width:"10%",align:"center"}
            ,{field: 'matterCheckDate', title: '检查日期', width: "10%",align:"center", sort: true,templet:'<div>{{ layui.util.toDateString(d.bir, "yyyy-MM-dd") }}</div>'}
            ,{field: 'matterCheckResult', title: '检查结果', width: "10%",align:"center"}
            ,{field: 'temperatureCheck', title: '温度检查', width:"8%",align:"center"}
            ,{field: 'humidityCheck', title: '湿度检查', width:"8%",align:"center"}
            ,{field: 'sanitationCheck', title: '卫生检查', width:"8%",align:"center"}
            ,{field: 'metamorphicCheck', title: '变质检查', width:"8%",align:"center"}
            ,{field: 'wearoutCheck', title: '破损检查', width:"8%",align:"center"}
            , {field: 'op', title: '操作', width: "10%", align: "center", toolbar: "#barDemo"}
        ]]
    });

    /******监听工具条事件************/
    //监听表的工具条
    //监听头工具栏事件
    table.on('toolbar(test)', function (obj) {
        var checkStatus = table.checkStatus(obj.config.id)
            , data = checkStatus.data; //获取选中的数据
        switch (obj.event) {
            case 'add':
                layer.open({
                    type: 2,
                    shade: true,
                    area: ['1000px', '440px'],
                    maxmin: false,
                    anim: 1,
                    title: "添加物料检查单",
                    content: '/inventory/add_Matter_check',
                    zIndex: layer.zIndex, //重点1
                    success: function (layero) {
                        layer.setTop(layero); //重点2
                    }
                });

                break;
        };
    });

    /*******给搜索按钮绑定事件*************/
    $("#search").click(function(){

        //获得输入框的内容
        var myname = $("#name").val();
        var myclazz = $("#clazz").val();

        table.reload('demo', {
            where: { //设定异步数据接口的额外参数，任意设
                name:myname
                ,clazz:myclazz
            }
            ,page: {
                curr: 1 //重新从第 1 页开始
            }
        }); //只重载数据
    });

    //监听行工具条
    table.on('tool(test)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        if (layEvent === 'del') { //删除

            layer.confirm('真的删除行么', function (index) {

                $.post("/del", {"id": data.id}, function () {

                    table.reload('demo', {
                        page: {
                            curr: 1 //重新从第 1 页开始
                        }
                    }); //只重载数据
                    layer.close(index);
                });
                //
            });
        } else if (layEvent === 'edit') { //编辑
            /******修改数据********/
            layer.open({
                type: 2,
                shade: true,
                area: ['1000px', '440px'],
                maxmin: false,
                anim: 1,
                title: "物料检查单详情",
                content: '/inventory/add_Matter_check',
                zIndex: layer.zIndex, //重点1
                success: function (layero) {
                    layer.setTop(layero); //重点2
                    /*********弹出新窗体以后，给新窗中的控件赋值**********************/
                        //-------------获得弹出层页面的body部份
                    var body = layui.layer.getChildFrame("body");

                    //给弹出层body中的表单控件赋值
                    body.find("[name='id']").val(data.id);
                    body.find("[name='name']").val(data.name);
                    body.find("[name='clazz']").val(data.clazz);
                    body.find("[name='score']").val(data.score);
                    body.find("[value='" + data.gender + "']").attr("checked", true);//选中指定性别的单选按钮
                    body.find("[name='bir']").val(format(data.bir, 'yyyy-MM-dd'));
                }
            });
        }
    });

    /***********指定日期格式**********************/
        //指定日期转换格式
    var format = function (time, format) {
            var t = new Date(time);
            var tf = function (i) {
                return (i < 10 ? '0' : '') + i
            };
            return format.replace(/yyyy|MM|dd|HH|mm|ss/g, function (a) {
                switch (a) {
                    case 'yyyy':
                        return tf(t.getFullYear());
                        break;
                    case 'MM':
                        return tf(t.getMonth() + 1);
                        break;
                    case 'mm':
                        return tf(t.getMinutes());
                        break;
                    case 'dd':
                        return tf(t.getDate());
                        break;
                    case 'HH':
                        return tf(t.getHours());
                        break;
                    case 'ss':
                        return tf(t.getSeconds());
                        break;
                }
            })

        }

});