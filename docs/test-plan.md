# Sales Analysis (Progression 4 - Testing)
## Test Results

| Test | Input Data | Expected Result | Actual Result | Pass/Fail |
|---|---|---|---|---|
| Original Dataset | {12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6}; | Starting Month: Jan<br>Ending Month: Oct<br>Highest combined sales change: 62 million | Starting Month: Jan<br>Ending Month: Oct<br>Highest combined sales change: 62 million | Pass |
| All Negative | {-6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6}; | Starting Month: Jan<br>Ending Month: Jan<br>Highest combined sales change: -6 million | Starting Month: Jan<br>Ending Month: Jan<br>Highest combined sales change: -6 million | Pass |
| Single Month | {-6, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6, 66}; | Starting Month: Dec<br>Ending Month: Dec<br>Highest combined sales change: 66 million | Starting Month: Dec<br>Ending Month: Dec<br>Highest combined sales change: 66 million | Pass |
| Best Period First | {66, 66, -6, -6, -6, -6, -6, -6, -6, -6, -6, -6}; | Starting Month: Jan<br>Ending Month: Feb<br>Highest combined sales change: 132 million | Starting Month: Jan<br>Ending Month: Feb<br>Highest combined sales change: 132 million | Pass |
| Best Period Last | {-6, -6, -6, -6, -6, -6, -6, -6, -6, -6, 66, 66}; | Starting Month: Nov<br>Ending Month: Dec<br>Highest combined sales change: 132 million | Starting Month: Nov<br>Ending Month: Dec<br>Highest combined sales change: 132 million | Pass |
| Tied Max Totals | {66, -100, -6, -6, -6, -6, -6, -6, -6, -6, -6, 66}; | Starting Month: Jan<br>Ending Month: Jan<br>Highest combined sales change: 66 million | Starting Month: Jan<br>Ending Month: Jan<br>Highest combined sales change: 66 million | Pass |
 
