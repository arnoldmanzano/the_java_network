##### the_java_network
- console-based social networking application (similar to Twitter) implemented in java with the features below.

###### Features:
- User creating: a new user called Spike can be created
- Posting: Spike can publish messages to a personal timeline
- Reading: Spike can view Nikesh’s timeline
- Following: Leo can subscribe to Spike and Nikesh's timelines, and view an aggregated list of all subscriptions

###### Usage
commands available
```sh
user <username> #create user to switch to user
post <message>
timeline <username>
follow <username>
subscriptions  #print timelines of users you are following
exit
```

###### TODO
1. Input sanitation, the program is easily breakable by inputting missing arguments to commands.
2. Refactor a many things. :)

###### Sample log
```
Welcome to the_java_network
> user arnold
Logged in as arnold
> post this is arnold's message
Message posted successfully
> timeline arnold
this is arnold's message
> user spike
Logged in as spike
> follow arnold
User arnold is now followed
> timeline arnold
this is arnold's message
> subscriptions
this is arnold's message
> post this is spike's message
Message posted successfully
> user leo
Logged in as leo
> follow arnold
User arnold is now followed
> follow spike
User spike is now followed
> subscriptions
this is arnold's message
this is spike's message
> exit
```
