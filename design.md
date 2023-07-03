# Moment
(noun) def. a very brief period of time.
capture life's daily tasks and share with your friends. experience life from different perspectives and stay in touch even when you're miles apart.

---

## User Stories

1. User should be able to create a "moment" and save to their individual profile.
2. Users should be able to browse all of their moments.
3. Users can search by date to see what they've completed that day.
4. Moments can be edited -> title
5. Moments can be edited -> description
6. Moments can be edited -> photo (intiially does not have a photo upon creation.)
7. Moments can be edited -> delete
8. Users should be able to friend/follow other users.
9. Users will be able to have a customizable profile (username, profile photo, shows list of moments, total moments had, etc)
10. Users will be able to comment on other users' moments.
11. Moments can be set to private or public.

---

## Tables

1. Moments
   1. Every moment is held here. Uses a GSI to sort by username/userId.
      1. Username: String, partition key. (handed in through cognito/auth token)
      2. Moment ID: String, randomly generated upon creation
      3. Title: String, few worded summary of task/moment
      4. Description: String, allow for many words/long post to describe task.
      5. Photo: photo (?) -> S3 bucket
      6. Comments -> comments table

2. Comments
   1. Comments for each moment. 
      1. Moment ID: String, partition key. Uses a GSI to sort by moment ID. 
      2. Comment ID: String, randomly generated upon creation.
      3. Content: String
      4. Username: String
      5. Timestamp: ZonedDateTime

3. Users
   1. Every user is held here.
      1. Username: String, partition key (handed in through cognito/auth token)
      2. Moments: Integer, amount of moments created
      3. Moments list: List, list of moments (titles only)
      4. Friends: Integer, amount of friends
      5. Friends list: List, list of friends (usernames)
