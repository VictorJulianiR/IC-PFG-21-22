Feature: Elevator

Scenario:  requestElevatorFromFloorDown closeDoor stopRequestOFF stopRequestOFF stopRequestON noMoreRequest requestElevatorFromFloorDown closeDoor stopRequestON existAnotherRequest closeDoor stopRequestON wrongInput downAtFirstFloor 

When requestElevatorFromFloorDown
And closeDoor
And stopRequestOFF
And stopRequestOFF
And stopRequestON
And noMoreRequest
And requestElevatorFromFloorDown
And closeDoor
And stopRequestON
And existAnotherRequest
And closeDoor
And stopRequestON
And wrongInput
And downAtFirstFloor


Scenario:  wrongInput downAtFirstFloor 

When wrongInput
And downAtFirstFloor


Scenario:  requestElevatorFromFloorDown closeDoor stopRequestON noMoreRequest wrongInput downAtFirstFloor 

When requestElevatorFromFloorDown
And closeDoor
And stopRequestON
And noMoreRequest
And wrongInput
And downAtFirstFloor


