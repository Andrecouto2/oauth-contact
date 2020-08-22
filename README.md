# Post ACCESS TOKEN 

```
http://localhost:25565/oauth/token
```

# Response ACCESS TOKEN 
```
{
    "access_token": "c138b838-946b-4888-8de4-cea964488efc",
    "token_type": "bearer",
    "refresh_token": "36582286-4699-4c01-aad8-44cd9cb0fd08",
    "expires_in": 41046,
    "scope": "all"
}
```
# Post Contact 
```
http://localhost:8088/contacts
```
# Response Contact
```
{
  "name" : "Jorge",
  "phone": "11989982398"
}
```
# Get Contacts
```
http://localhost:8088/contacts
```
# Response Contacts
```
[
    {
    	"id" : 1,
    	"name" : "Jorge",
    	"phone" : "11989982398",
    	"userId" : "7",
    	"username" : "andre-luis"
    }
]
```
