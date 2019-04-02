$(function(){

	$('.bodyHeight').css('height',($(document).outerHeight()+'px'));

	

	

	$('.changeTypeSelect').click(function(){
			if($(this).index() == 0){
				$(this).siblings().removeClass('changeTypeSelect_selected');
				$(this).addClass('changeTypeSelect_selected');
				if($('.selected_1').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
				
				$('.selectedDiv').slideUp();
				$('.selected_1').slideDown();
			}else if($(this).index() == 1){
				$(this).siblings().removeClass('changeTypeSelect_selected');
				$(this).addClass('changeTypeSelect_selected');
				if($('.selected_2').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
				
				$('.selectedDiv').slideUp();
				$('.selected_2').slideDown();
			}else if($(this).index() == 2){
				$(this).siblings().removeClass('changeTypeSelect_selected');
				$(this).addClass('changeTypeSelect_selected');
				if($('.selected_3').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
				
				$('.selectedDiv').slideUp();
				$('.selected_3').slideDown();
			}
			else if($(this).index() == 3){
				$(this).siblings().removeClass('changeTypeSelect_selected');
				$(this).addClass('changeTypeSelect_selected');
				if($('.selected_4').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
				
				$('.selectedDiv').slideUp();
				$('.selected_4').slideDown();
			}
	});
	$('.details_Data').click(function(){
		$(this).parent().find('.details_MessageRow').slideToggle();
	})
	//替换SELECT选择列表
	$('.forInputSelect').click(function(){
		//input选择列表显示
		$('.inputSelectOuterDiv').css({'display':'block'});
		setTimeout(function(){
			$('.inputSelectOuterDiv').css({'width':'550px'});
		},500);
		
	});
	//input选择列表 点选后将选择值赋值给input 输入框
	$('.inputSelecList').click(function(){
		$('.forInputSelect').val($(this).find('.inputSelectValue').text());	
		$('.inputSelectOuterDiv').css({'width':'0%'});
		setTimeout(function(){
			if($('.inputSelectOuterDiv').css('width') == '0px'){
				$('.inputSelectOuterDiv').css({'display':'none'});
			}
		},2500);
	})

	

});






