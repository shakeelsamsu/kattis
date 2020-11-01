import feedparser
import config
import twitter
import bs4

# Kattis RSS
url = 'https://open.kattis.com/rss/new-problems'
feed = feedparser.parse(url)

# Twitter API Configuration
api = twitter.Api(consumer_key=config.consumer_key,
                  consumer_secret=config.consumer_secret,
                  access_token_key=config.access_token,
                  access_token_secret=config.access_token_secret)

# Use stored cache to search for newly added problems
with open(config.cache_file, 'r') as f:
    actual_last = f.read()
    for entry in feed.entries:
        if entry.title == actual_last:
            break
        post_msg = 'A new problem has been added to Kattis!\n' + 'Solve ' + entry.title + ' now!\n' + entry.link
        api.PostUpdate(post_msg)

# Update cache with last added problem
with open(config.cache_file, 'w') as f:
    f.truncate(0)
    f.write(feed.entries[0].title)
    f.close()