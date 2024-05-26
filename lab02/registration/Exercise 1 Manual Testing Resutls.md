### UserName 
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| A00000| OK|OK |Pass |
| zzzzzzzzzzzz| OK|OK | Pass|
| EMPTY| Err2| Err1+Err3 | Fail|
| z| Err3| Err1+Err3| Inconclusive|
| 2amcdef| Err1| Err1 | Pass|
| a>qwsjn| Err1| Err1 | Pass|

___
### First Name
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| EMPTY| OK| OK | Pass|
| aa bb| OK| OK| Pass|
| >bafj| Err4| Err4 | Pass|
| baf@j| Err4| Err4 | Pass|

___
### Last Name
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| EMPTY| OK| OK | Pass|
| aa bb| OK| OK| Pass|
| >bafj| Err5| Err5 |Pass |
| baf@j| Err5| Err5 | Pass|

___
### Email
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| paul@everywhere.email| OK| OK | Pass|
| paul@every@where.email| Err6| Err6| Pass|
| EMPTY| Err7| Err6 | Fail|

___
### Age
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| 18| OK| OK | Pass|
| 64| OK| OK | Pass|
| EMPTY| Err8| Err8 |Pass |
| 17| Err9| Err9 | Pass|
| 65| Err10| Err10| Pass|
| /1| Err?| JavaErr | Inconclusive|

___
### City
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| Ottawa| OK| OK | Pass|
| Toronto| OK| OK | Pass|
| Montreal| OK| OK | Pass|
| Halifax| OK| OK | Pass|
| EMPTY| Err?| Can't select empty| Inconclusive|

___
### Postal Code
| Test Case   | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| Y9Z9Z9| OK| OK| Pass|
| Y9Z 9Z9| OK| OK| Pass|
| Z9Z9Z9| Err11| Err11|Pass |
| EMPTY| Err11?| Err11 | Pass|
| 9Z99Z9| Err11| Err11| Pass|
| D9Z9Z9| Err11| Err11| Pass|