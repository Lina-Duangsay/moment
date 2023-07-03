# Moment
(noun) def. a very brief period of time.
capture life's daily tasks and share with your friends. experience life from different perspectives and stay in touch even when you're miles apart.

---

## User Stories

1. User should be able to create a "moment" and save to their individual profile.
2. Users should be able to browse all of their moments.
3. Moments can be edited -> title
4. Moments can be edited -> description
5. Moments can be edited -> photo (intiially does not have a photo upon creation.)
6. Moments can be edited -> delete
7. Users should be able to friend/follow other users.
8. Users will be able to have a customizable profile (username, profile photo, shows list of moments, total moments had, etc)
9.  Users will be able to comment on other users' moments.
10. Moments can be set to private or public.

## Stretch:

1. Retrieve goal by a specific day

---

## Tables

1. Moments
   1. Every moment is held here. 
      1. Username: String, partition key. (handed in through cognito/auth token)
      2. Moment ID: String, randomly generated upon creation
      3. Title: String, few worded summary of task/moment
      4. Description: String, allow for many words/long post to describe task.
      5. Photo: photo (?) -> S3 bucket
      6. Comments -> comments table
      7. Privacy: String
         1. GSI:
            1. Uses a GSI to sort by username/userId.
            2. Display by username -> privacy 

2. Comments
   1. Comments for each moment. 
      1. Moment ID: String, partition key. key referencing the corresponding Moment in the Moments table
      2. Comment ID: String, randomly generated upon creation.
      3. Content: String
      4. Username: String
      5. Timestamp: ZonedDateTime
         1. GSI:
            1. Uses a GSI to sort by moment ID. 

> to display comments for a moment, query the Comments table based on the Moment ID and retrieve all comments associated with that Moment ID.
> separates the comments into a separate table, which can help with scalability and performance as the number of comments grows. allows for more flexibility in managing and querying comments independently from moments.

3. Users
   1. Every user is held here.
      1. Username: String, partition key (handed in through cognito/auth token)
      2. Display name: String
      3. Profile photo: photo -> S3 Bucket
      4. Moments: Integer, amount of moments created
      5. Moments list: List, list of moments (titles only)
      6. Friends: Integer, amount of friends
      7. Friends list: List, list of friends (usernames)

---

## Endpoints

### Moments

1. Create Moment (POST)
2. Retrieve Moment
3. Edit: Title (PUT)
4. Edit: Description (PUT)
5. Edit: Upload Photo (PUT)
6. Edit: Delete (DELETE)
7. Edit: Privacy (PUT)

### Users
1. Edit: Display Name (PUT)
2. Edit: Profile Photo (PUT)
3. Retrieve Friends (GET)
4. Retrieve Friends List (GET)
5. Retrieve Moments (GET)
6. Retrieve Moments List (GET)
7. Follow User
8. Unfollow User

### Comments
1. Comment: Create (POST)
2. Comment: Fetch Comments (GET)