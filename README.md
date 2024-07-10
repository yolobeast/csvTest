# Overview

CSV test will let you open 2 CSV file and compare them together and show the differents 

## Requirments 

- Java
- opencsv-3.8.jar - I did not use any IDE to develop this program I used vscode, this means that to get it run install this specfic library and update the settings.json file to 

## Running the program 

- Go to csvTest.java 
- Run the specfic file 
- Choose the first CSV file from CSVFiles folder
- Choose the second CSV file from CSVFiles folder 

## Output 

- The program should clearly show you the different between the first file and the second one 

## CSVFiles

- test1_normal.csv - This is a standard csv with 11 columns and 100 rows
- test2_missingValues.csv - This csv does not have some of the value but it is identical to the first one 
- test3_missingHeadder.csv - This is identical to the first csv but its missing the headder
- test4_empty.csv - This is just an empty csv
- test5_fileWithLotOfData.csv - This one is identical to the fisr one but it has 1000 rows of info
- test6_duplicatedRow.csv - This one contains some duplicate items 
- test7_differetncsv.csv - This is a compleatly different csv
- test8_originalCsvWithMoreItem.csv - This csv is identical to the first one but it has more items 
- test9_missingEntireColumn.csv - Very similar csv to the first one but its missing the first column 
- test10_missingBunchOfRows.csv - This is very similar to the first CSV but is missing bunch of rows
