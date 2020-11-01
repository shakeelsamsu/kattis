# KattisRSSNotifier

This tool features a [Twitter Bot](https://twitter.com/KattisUpdates) that tweets whenever a new problem has been added to the Kattis Problem Archive.
It operates by locating newly added problems in the [RSS feed](https://open.kattis.com/rss/new-problems) for new problems posted to Kattis. 
The script is run every hour and will tweet out links to newly added problems.

## Configuration

The script uses API keys/secrets stored in `config.py` and stores the last added problem (the most recent problem added to the Kattis Problem Archive) in a text file designated in `config.py`.

In order to run the script on an hourly basis, I've used a simple task schedulers, for example `cron` on Linux systems. An alternative for Windows machines is the Windows Task Scheduler.

## Notice

This Twitter Bot is not affiliated with the Kattis Problem Archive in any official manner. This is a simple educational and informative tool I developed as an exercise in development and also as a neat way of informing me when my favorite online judge has been updated with new and fun problems to solve!