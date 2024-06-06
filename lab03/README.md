# Lab 3
Ahmad Alkawasmeh 
300064642

## Summary
The goal of this lab was to implement coverage tests, learn how coverage tests work and the underlying mechanisms of coverage testing tools. 

## Important remarks
I was only able to achieve 98 percent branch coverage before refactoring. I know this is the best I could do without changing the actual Date class because it was due to an **unreachable** branch of the method named **isEndOfMonth**. That is where the date needs to be **February 30 and not leap year**, which makes it an invalid date, thus an illegalArgumentException is thrown **before** it reaches the **isEndOfMonth** method, therefore we can never cover that branch. 

After refactoring, I was able to achieve 100 percent coverage for the Date class.

## Run instructions
In order to run the tests with jacoco coverage: 
- Download the lab03 folder
- Change directory into the downloaded lab03 folder 
- Finally execute: 
	- ./date/bin/jacoco


## Screenshots
1- Date coverage results initially\
![DateCoverage](https://github.com/ahmadalkawasmeh/seg3103_playground/blob/main/lab03/assets/DateCoverageBefore.png)\
2- Date coverage results after writing tests, and before refactoring\
![DateCoverageTests](https://github.com/ahmadalkawasmeh/seg3103_playground/blob/main/lab03/assets/DateCoverageAfterTests.png)\
3- Date coverage after refactoring\
![DateCoverageRefactoring](https://github.com/ahmadalkawasmeh/seg3103_playground/blob/main/lab03/assets/DateCoverageAfterRefactoring.png)\
