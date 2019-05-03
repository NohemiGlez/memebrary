# memebrary
A Spring Boot app to store your favorite memes.

## Website
https://memebrary.herokuapp.com/

## Heroku deploy information
Don't forget this commands

1. How to manual deploy to heroku?
```
mvn clean heroku:deploy-war
```

2. How to generate dynos?
```
heroku ps:scale web=1
```
3. After generate dynos, don't forget restart heroku:
```
heroku restart
```

## Extra content

1. More about readme syntax:
[Basic writting and formatting syntax, GitHub Help](https://help.github.com/en/articles/basic-writing-and-formatting-syntax#quoting-code)
