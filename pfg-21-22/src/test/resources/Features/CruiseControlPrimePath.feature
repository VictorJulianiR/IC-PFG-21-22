Feature: CruiseControl

Scenario: initialize carEngineON on disableCruiseControl accelerator on/enableControl disableCruiseControl on/enableControl carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And disableCruiseControl
And accelerator
And on/enableControl
And disableCruiseControl
And on/enableControl
And carEngineOFF
And shutdown


Scenario: initialize carEngineON resume on disableCruiseControl carEngineOFF carEngineON carEngineOFF shutdown 

Given initialize
When carEngineON
And resume
And on
And disableCruiseControl
And carEngineOFF
And carEngineON
And carEngineOFF
And shutdown


Scenario: initialize carEngineON on on disableCruiseControl on/enableControl carEngineOFF carEngineON on carEngineOFF carEngineON on carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And on
And disableCruiseControl
And on/enableControl
And carEngineOFF
And carEngineON
And on
And carEngineOFF
And carEngineON
And on
And carEngineOFF
And shutdown


Scenario: initialize accelerator shutdown 

Given initialize
When accelerator
And shutdown


Scenario: initialize carEngineON on disableCruiseControl carEngineOFF carEngineON on disableCruiseControl carEngineOFF carEngineON on carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And disableCruiseControl
And carEngineOFF
And carEngineON
And on
And disableCruiseControl
And carEngineOFF
And carEngineON
And on
And carEngineOFF
And shutdown


Scenario: initialize shutdown 

Given initialize
When shutdown


Scenario: initialize carEngineON carEngineOFF carEngineON carEngineOFF shutdown 

Given initialize
When carEngineON
And carEngineOFF
And carEngineON
And carEngineOFF
And shutdown


Scenario: initialize carEngineON on disableCruiseControl carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And disableCruiseControl
And carEngineOFF
And shutdown


