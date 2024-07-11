# Lab 7
Ahmad Alkawasmeh 
300064642

# Summary of Bugs Identified

## Bad Practice Bugs
#### Comparison of String parameter using == or != 
Fixed using `equals(Object)`  method. 

#### Certain swing methods needs to be invoked in Swing thread
To fix this, I would move the `frame.setVisible(true);` statement from the main class to the Swing event thread. 

## Performance Bugs
#### Could be refactored into a named static inner class
This bug is caused by CalCFrame being an inner class, but not using its embedded reference to parent object in `CalCFrame.java`. Thus, making the instance of the class larger than needed and keeps the reference to parent object alive for longer, utilizing excessive resources. 

#### Private method is never called
`CalCFrameTest.setClearscreen(CalCFrame, boolean)` is never called. So I would remove it in order to address this bug. 

#### Boxing/unboxing to parse a primitive
We have two bugs in CalCFframe.java using `Double.valueOf(X).doubleValue();` to extract the value of x. To fix this I would just use `Double.valueOf(X)` instead. 

#### Unread field: should this field be static?
`CalCFrame.ADD`, `CalCFrame.SUB`, `CalCFrame.MULT`, `CalCFrame.DIVI`, `CalCFrame.POW`, `CalCFrame.SQRT` are initialized to a compile time static value, therefore these should also be static. 

## Dodgy Code Bugs
#### Method uses the same code for two branches && Condition has no effect
`getContentPane().add( buttons[i] )` is called no matter what the value of `i` is. I would just remove all the conditionals and replace them with a single statement that executes `getContentPane().add( buttons[i] );`

#### Switch statement found where default case is missing
The bug is that `CalCFrame.calculate(int, double, double)` has a switch case statement without a default case. Therefore, a default `break;` case is needed at the end of the switch case. 

#### Condition has no effect
The bug is because we are checking whether `morenums` is true at a point where it is always true because we checked if it was false earlier. Therefore, it should be removed. 

## Screnshots
1- App running\
![appRunning](https://github.com/ahmadalkawasmeh/seg3103_playground/blob/main/lab07/calculator/assets/appRun.png)\
2- SpotBug Report\
![SpotBug](https://github.com/ahmadalkawasmeh/seg3103_playground/blob/main/lab07/calculator/assets/spotBugScreenshot.png)\