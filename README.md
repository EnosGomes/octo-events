# Octo Events

Octo Events is an application that receives events from GitHub via WebHooks and expose them via API.


![alt text](imgs/octo_events.png)

The expected endpoints are:

## 1. WebHook Endpoint

This endpoint receives events from GitHub and stores them in the database.

Read this in order to know how webhooks work:

* WebHooks Overview: https://developer.github.com/webhooks/ 
* Creating Webhooks : https://developer.github.com/webhooks/creating/

The endpoint should be accessible through `/events`

## 2. Events Endpoint  

This endpoint should expose events through an api and filter them by issue

**Request:**

> GET /issues/1000/events

**Response:**

> 200 OK
```javascript
[ 
  { "action": "open", created_at: "...",}, 
  { "action": "closed", created_at: "...",} 
]
```

**Instructions on how to integrate with GitHub **

* Tip: You can use ngrok (https://ngrok.com/) in order to debug webhook calls. 

   $ sudo ngrok http 4000 

![alt text](imgs/ngrok.png)

   GitHub

![alt text](imgs/add_webhook.png)
 
**Final considerations**

* Any library or framework is allowed to be used
* Tests should be written
* Use Postgres 9.6
* Use the latest version of Java
