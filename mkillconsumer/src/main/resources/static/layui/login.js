
(function ($) {
    "use strict";

    //
    //  /*==================================================================
    // [ Focus input ]*/
    // $('.input100').each(function(){
    //     $(this).on('blur', function(){
    //         if($(this).val().trim() != "") {
    //             $(this).addClass('has-val');
    //         }
    //         else {
    //             $(this).removeClass('has-val');
    //         }
    //     })
    // })
    //
    //
    // /*==================================================================
    // [ Validate ]*/
    // var input = $('.validate-input .input100');
    //
    // $('.validate-form').on('submit',function(){
    //     var check = true;
    //
    //     for(var i=0; i<input.length; i++) {
    //         if(validate(input[i]) == false){
    //             showValidate(input[i]);
    //             check=false;
    //         }
    //     }
    //
    //     return check;
    // });
    //
    //
    // $('.validate-form .input100').each(function(){
    //     $(this).focus(function(){
    //        hideValidate(this);
    //     });
    // });
    //
    // function validate (input) {
    //     if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
    //         if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
    //             return false;
    //         }
    //     }
    //     else {
    //         if($(input).val().trim() == ''){
    //             return false;
    //         }
    //     }
    // }
    //
    // function showValidate(input) {
    //     var thisAlert = $(input).parent();
    //
    //     $(thisAlert).addClass('alert-validate');
    // }
    //
    // function hideValidate(input) {
    //     var thisAlert = $(input).parent();
    //
    //     $(thisAlert).removeClass('alert-validate');
    // }
    //
    // function login() {
    //     alert("你好，我是一个警告框！");
    // }

    $("login").click(function(){
        $.post("/try/ajax/demo_test_post.php",
            {
                name:"菜鸟教程",
                url:"http://www.runoob.com"
            },
            function(data,status){
                alert("数据: \n" + data + "\n状态: " + status);
            });
    });
})(jQuery);