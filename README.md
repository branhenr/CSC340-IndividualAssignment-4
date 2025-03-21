## API Endpoints
Base URL: [`http://localhost:8080/animals`](http://localhost:8080/animals)

### [`/all`](http://localhost:8080/animals/all) (GET)
Gets a list of all the artic animals in the database.

### Response
```
[
   {
    "animalId": 1,
    "name": "Arctic Fox",
    "diet": "Omnivores",
    "animalClass": "Mammal",
    "description": "Small"
    },
    {
    "animalId": 2,
    "name": "Greenland Shark",
    "diet": "Carnivore",
    "animalClass": "Fish",
    "description": "Big"
    }

]
```
### [`/class/{animalClass}`](http://localhost:8080/animals/class/mammal) (GET)
Gets a list of all the artic animals for a certain class.

#### Parameters
path variable: 'class' &lt;String&gt; - REQUIRED

### Response
```
[
   {
    "animalId": 1,
    "name": "Arctic Fox",
    "diet": "Omnivores",
    "animalClass": "Mammal",
    "description": "Small"
    }
]
```

### [`/diet/{diet}`](http://localhost:8080/animals/diet/carnivore) (GET)
Gets a list of all the artic animals based on their diet

#### Parameters
path variable: 'diet' &lt;String&gt; - REQUIRED

### Response
```
[
   {
    "animalId": 2,
    "name": "Greenland Shark",
    "diet": "Carnivore",
    "animalClass": "Fish",
    "description": "Big"
    }
]
```

### [`/new`](http://localhost:8080/animals/new) (POST)
Create a new artic animal entry

### Request Body
```
[
  {
    "name": "Polar Bear",
    "diet": "Carnivore",
    "animalClass": "mammal",
    "description": "scary"
  }
]
```

### Response
```
[
   {
    "animalId": 1,
    "name": "Arctic Fox",
    "diet": "Omnivores",
    "animalClass": "Mammal",
    "description": "Small"
    },
    {
    "animalId": 2,
    "name": "Greenland Shark",
    "diet": "Carnivore",
    "animalClass": "Fish",
    "description": "Big"
    },
    {
    "animalId": 3,
    "name": "Polar Bear",
    "diet": "Carnivore",
    "animalClass": "mammal",
    "description": "scary"
    }

]
```
### [`/update/{animalId}`](http://localhost:8080/animals/update/3) (PUT)
Update an existing animal.

#### Parameters
- Path Variable: `animalId` &lt;integer&gt; - REQUIRED

#### Request Body
An animal object with the updates.
```
{
   "name": "Polar Bear",
    "diet": "Carnivore",
    "animalClass": "mammal",
    "description": "big and scary"
}
```
#### Response
```
{
   "animalId": 3,
    "name": "Polar Bear",
    "diet": "Carnivore",
    "animalClass": "mammal",
    "description": "big scary"
}
```
### [`/delete/{animalId}`](http://localhost:8080/animals/delete/1) (DELETE)
Delete an existing animal.

#### Parameters
- Path Variable: `animalId` &lt;integer&gt; - REQUIRED

#### Response
```
[
   {
    "animalId": 2,
    "name": "Greenland Shark",
    "diet": "Carnivore",
    "animalClass": "Fish",
    "description": "Big"
    },
    {
    "animalId": 3,
    "name": "Polar Bear",
    "diet": "Carnivore",
    "animalClass": "mammal",
    "description": "scary"
    }
]
```







