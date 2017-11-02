<?php
 require_once('db_connect.php');
 
    $myArray = array();
	$username = $_GET['username'];
   $password = $_GET['password'];
    if ($result = $mysqli->query("SELECT * FROM users WHERE
		username = '$username' AND password = '$password'")) {
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
