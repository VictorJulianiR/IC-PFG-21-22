Feature: Elevator

Scenario:  requestElevatorFromFloorDown closeDoor stopRequestON noMoreRequest wrongInput downAtFirstFloor 

When requestElevatorFromFloorDown
And closeDoor
And stopRequestON
And noMoreRequest
And wrongInput
And downAtFirstFloor


Scenario:  requestElevatorFromFloorDown closeDoor stopRequestOFF stopRequestON existAnotherRequest closeDoor stopRequestON wrongInput downAtFirstFloor 

When requestElevatorFromFloorDown
And closeDoor
And stopRequestOFF
And stopRequestON
And existAnotherRequest
And closeDoor
And stopRequestON
And wrongInput
And downAtFirstFloor


Scenario:  requestElevatorFromFloorDown closeDoor stopRequestON wrongInput downAtFirstFloor 

When requestElevatorFromFloorDown
And closeDoor
And stopRequestON
And wrongInput
And downAtFirstFloor


