<?php
 require_once('db_connect.php');
 
    $myArray = array();
	$HK_UserNo = $_GET['HK_UserNo'];
   $RoomNo = $_GET['RoomNo'];
    if ($result = $mysqli->query("
		SELECT 
			HK_START
			, HK_END 
			, INSP_START
			, INSP_END
		FROM housekeepingapp.sessions
		WHERE
			HK_UserNo = '$HK_UserNo' 
			AND RoomNo = '$RoomNo'
			AND 
			(
				HK_START IS NULL
				OR HK_END IS NULL
				OR INSP_START IS NULL
				OR INSP_END IS NULL
			)
		ORDER BY DateCreated ASC")) {
        $tempArray = array();
        while($row = $result->fetch_object()) {
                $tempArray = $row;
                array_push($myArray, $tempArray);
            }
        echo json_encode($myArray);
    }
    $result->close();
    $mysqli->close();
?>
