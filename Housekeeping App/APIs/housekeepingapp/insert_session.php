<?php
 require_once('db_connect.php');
 
    $myArray = array();
	$HK_UserNo = $_GET['HK_UserNo'];
	$RoomNo = $_GET['RoomNo'];
	
	$sql = "INSERT INTO housekeepingapp.sessions
	(
		`HK_UserNo`
		,`RoomNo`
		,`HK_START`
	)
	VALUES
	(
		'$HK_UserNo'
		,'$RoomNo'
		, NOW()
	)";

	if (mysqli_query($mysqli, $sql)) {
    echo "Record updated successfully";
	} else {
		echo "Error updating record: " . mysqli_error($mysqli);
	}

	mysqli_close($mysqli);
?>
