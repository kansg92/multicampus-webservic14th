
let cnt = 1;
function changToDo(event){
	const inputValue = event.target.innerText;
	const td = event.target;
	const input = event.target.querySelector('input');
	if(input.className == "hidden2" ){	
	input.classList.remove("hidden2");
	td.innerHTML = '<input type="text" name="todo">';
	input.focus();
	}
}


addEventListener("dblclick", changToDo);



function senddata(jsa){			
	$.ajax({
		url:'dailyReportviews',
		data:{'data':jsa},
		success:function(data){
			if(data == 'success'){
				alert("저장되었습니다.");
				
			}else if(data == 'fail'){
				alert("실패했습니다.");
			}
		}
	})
	$('#daily-form').submit();
}	

function getdata(){
	$('#daily_tbody tr').each(function(){
		var dataArrayToSend = [];
		var dataArrayToSend1 = [];
		var len = $(this).find("td").length;
		
		for(var i=0; i< len; i++){
		dataArrayToSend.push($(this).find("td").eq(i).text());
		}
		dataArrayToSend1.push(dataArrayToSend);			
	});	
};


function test (){
	console.log("hi!");
};

function addRow (endTime){
	cnt ++;
	var txt = '';
		txt += '<tr> ';
		txt += '<td ><input type = "text" name = "startTime" id="startTime'+cnt+'"  class="timepicker" value="'+endTime+'" disabled> ~ ';
		txt += '<input type = "text" name = "endTime" id="endTime'+cnt+'"   class="timepicker" value="'+endTime+'" ></td>';
		txt += '<td>';
		txt += '<select name="select-cate" id="cate'+cnt+'">';
		txt += '<option value="">--choose</option>';
		txt += '<option value="sleep">Sleep</option>';
		txt += '<option value="work">work</option>';
		txt += '<option value="study">study</option>';
		txt += '<option value="workout">Workout</option>';
		txt += '<option value="rest">Rest</option>';
		txt += '<option value="slack">Slack Off</option>';
		txt += '<option value="others">Others</option>';
		txt += '</select>';
		txt += '</td>';
		txt += '<td><input type="text" name="todo"></td>';
		txt += '<td>';
		txt += '<select name="select-immersion" id="immersion'+cnt+'">';
		txt += '<option value="">--choose</option>';
		txt += '<option value="good">good</option>';
		txt += '<option value="notgood">not good</option>';
		txt += '<option value="bad">bad</option>';
		txt += '</select>';
		txt += '</td>';
		txt += '</tr>';
	$('#daily_tbody').append(txt);
	$('input.timepicker').timepicker({
        timeFormat: 'HH:mm',
        interval: 15,
        startTime: '00:00',
        scrollbar: true
	});
	$('input.timepicker').css('width','100px');
	$('.dataTable-info').text(`Showing 1 to 1 of ${cnt} entries`);
}

function checkvalidation(){
	if($('#endTime'+cnt).val() === $('#startTime'+cnt).val() ){
		$('#cautionText').text('어이어이 시간은 금이라고 친구');
		return false;
	}
	if($('#endTime'+cnt).val() < $('#startTime'+cnt).val()){
		$('#cautionText').text('Check End Times please');
		return false;	
	}
	if($('#cate'+cnt).val() == ''){
		$('#cautionText').text('category is empty');
		return false;	
	}
	if($('#immersion'+cnt).val() == ''){
		$('#cautionText').text('immersion is empty');
		return false;	
	}
	
	
	
	return true;
};


$(document).ready(function(){
	$('#daily-form').keyup(function(event){
		if(window.event.keyCode == 13){
			const input = event.target;
			if(input.value == ''){
				return;
			}else{
				input.after(input.value);
				input.classList.add("hidden2");
			}

		}
	});
	
	$('input.timepicker').timepicker({
        timeFormat: 'HH:mm',
        interval: 15,
        startTime: '00:00',
        scrollbar: true
	});
	
	
	$('#daily-saveBtn').click(function(){	
		var check = checkvalidation();
		if(check){		
			$('.timepicker').attr('disabled',false);
			const sa = $('#daily-form').serializeArray();
			const jsa = JSON.stringify(sa);
			senddata(jsa);
		}
	});

	$('input.timepicker').css('width','100px');

	$('#addBtn').click(function(){		
		const endTime = $("#endTime"+cnt).val();	
		var check = checkvalidation();
		if(check){
			$('#cautionText').text('');
			$("#endTime"+cnt).attr('disabled',true);
			addRow(endTime);
		}
	});
});

