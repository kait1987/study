<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3> ȸ�� ���� ������</h3>
		<form method="post" action="signupcotroller.jsp">
			���̵� : <input type="text" name="id"> <br>
			��й�ȣ : <input type="password" name="password"> <br>
			��й�ȣ Ȯ�� : <input type="password" name="passwordconfirm"> <br>
			�̸� : <input type="text" name="name"> <br>
			�̸��� : <input type="email" name="email"> <br>
			�ּ� : <input type="text" id="sample5_address" placeholder="�ּ�" name="address1">
					<input type="button" onclick="sample5_execDaumPostcode()" value="�ּ� �˻�"><br>
					<div id="map" style="width:300px;height:300px;margin-top:10px;display:none"></div>
			����ó : <select name="Phone1">
					<option>010</option>
					</select>
					<input type="text" name="Phone2">
					<input type="text" name="Phone3">
					
				<input type="submit" value="ȸ������ ��û"> <br>	
		</form>


<!-- �������� api -->

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=�߱޹��� API KEY�� ����ϼ���&libraries=services"></script>
<script>
    var mapContainer = document.getElementById('map'), // ������ ǥ���� div
        mapOption = {
            center: new daum.maps.LatLng(37.537187, 127.005476), // ������ �߽���ǥ
            level: 5 // ������ Ȯ�� ����
        };

    //������ �̸� ����
    var map = new daum.maps.Map(mapContainer, mapOption);
    //�ּ�-��ǥ ��ȯ ��ü�� ����
    var geocoder = new daum.maps.services.Geocoder();
    //��Ŀ�� �̸� ����
    var marker = new daum.maps.Marker({
        position: new daum.maps.LatLng(37.537187, 127.005476),
        map: map
    });


    function sample5_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var addr = data.address; // ���� �ּ� ����

                // �ּ� ������ �ش� �ʵ忡 �ִ´�.
                document.getElementById("sample5_address").value = addr;
                // �ּҷ� �� ������ �˻�
                geocoder.addressSearch(data.address, function(results, status) {
                    // ���������� �˻��� �Ϸ������
                    if (status === daum.maps.services.Status.OK) {

                        var result = results[0]; //ù��° ����� ���� Ȱ��

                        // �ش� �ּҿ� ���� ��ǥ�� �޾Ƽ�
                        var coords = new daum.maps.LatLng(result.y, result.x);
                        // ������ �����ش�.
                        mapContainer.style.display = "block";
                        map.relayout();
                        // ���� �߽��� �����Ѵ�.
                        map.setCenter(coords);
                        // ��Ŀ�� ��������� ���� ��ġ�� �ű��.
                        marker.setPosition(coords)
                    }
                });
            }
        }).open();
    }
</script>
</body>
</html>