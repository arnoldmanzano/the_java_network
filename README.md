##### the_java_network
- simple tweeting/messaging command line app built in java

###### Usage
commands available
```sh
user <username> #create user to switch to user
post <message>
timeline <username>
follow <username>
subscriptions  #print timelines of users you are following
```

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
>
```
