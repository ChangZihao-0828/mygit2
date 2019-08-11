layui.use(['form', 'layedit', 'laydate'], function() {
    var form = layui.form
        , layer = layui.layer
        , layedit = layui.layedit
        , laydate = layui.laydate;

    //日期
    laydate.render({
        elem: '#date'
        ,trigger: 'click'
    });

    //日期时间选择器
    laydate.render({
        elem: '#test5'
        ,type: 'datetime'
        ,trigger: 'click'
    });

    //日期时间选择器
    laydate.render({
        elem: '#test6'
        ,type: 'datetime'
        ,trigger: 'click'
    });

    //监听提交
    form.on('submit(demo1)', function(data){
        layer.alert(JSON.stringify(data.field), {
            title: '最终的提交信息'
        })
        return false;
    });

});