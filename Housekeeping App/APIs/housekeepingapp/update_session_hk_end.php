<?php
 require_once('db_connect.php');
 
	$UserNo = $_GET['UserNo'];
	$RoomNo = $_GET['RoomNo'];
	$sql = "UPDATE housekeepingapp.sessions
	SET 
		HK_END = NOW()
	WHERE 
		HK_UserNo = '$UserNo'
		AND RoomNo = '$RoomNo'
		AND HK_END IS NULL";

	if (mysqli_query($mysqli, $sql)) {
    echo "Record updated successfully";
	} else {
		echo "Error updating record: " . mysqli_error($mysqli);
	}

	mysqli_close($mysqli);

?>
