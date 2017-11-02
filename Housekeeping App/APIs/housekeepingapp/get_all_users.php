<?php
 require_once('db_connect.php');
 
    $myArray = array();
    if ($result = $mysqli->query("SELECT * FROM users")) {
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
