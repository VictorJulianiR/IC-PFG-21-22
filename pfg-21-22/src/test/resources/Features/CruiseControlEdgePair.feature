Feature: CruiseControl

Scenario: initialize carEngineON resume resume on carEngineOFF accelerator shutdown 

Given initialize
When carEngineON
And resume
And resume
And on
And carEngineOFF
And accelerator
And shutdown


Scenario: initialize carEngineON on disableCruiseControl on/enableControl on disableCruiseControl accelerator on/enableControl carEngineOFF carEngineON resume carEngineOFF carEngineON resume on on on disableCruiseControl carEngineOFF accelerator carEngineON on disableCruiseControl accelerator carEngineOFF shutdown 

Given initialize
When carEngineON
And on
And disableCruiseControl
And on/enableControl
And on
And disableCruiseControl
And accelerator
And on/enableControl
And carEngineOFF
And carEngineON
And resume
And carEngineOFF
And carEngineON
And resume
And on
And on
And on
And disableCruiseControl
And carEngineOFF
And accelerator
And carEngineON
And on
And disableCruiseControl
And accelerator
And carEngineOFF
And shutdown


Scenario: initialize carEngineON carEngineOFF shutdown 

Given initialize
When carEngineON
And carEngineOFF
And shutdown


Scenario: initialize accelerator carEngineON carEngineOFF carEngineON resume on disableCruiseControl on/enableControl disableCruiseControl accelerator accelerator carEngineOFF carEngineON carEngineOFF accelerator accelerator carEngineON on on carEngineOFF shutdown 

Given initialize
When accelerator
And carEngineON
And carEngineOFF
And carEngineON
And resume
And on
And disableCruiseControl
And on/enableControl
And disableCruiseControl
And accelerator
And accelerator
And carEngineOFF
And carEngineON
And carEngineOFF
And accelerator
And accelerator
And carEngineON
And on
And on
And carEngineOFF
And shutdown


Scenario: initialize shutdown 

Given initialize
When shutdown


