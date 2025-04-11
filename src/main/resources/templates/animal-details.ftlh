<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <title>Animal Details</title>
</head>
<body>
<ul class="nav">
    <li class="nav-item">
        <a class="nav-link active" aria-current="page" href="/animals/all">Main</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/animals/createForm">Create New Animal</a>
    </li>
</ul>

<div class="container" style="margin-top: 15px;">
    <h1>${title}</h1>
    <div class="card">
        <h5 class="card-header">${animal.name}</h5>

        <div class="card-body">
            <span style="float:right"> <a href="/animals/update/${animalId?c}"
                                          class="btn btn-primary">Edit Animal</a></span>
            <h5 class="card-title">ID: ${animal.animalId}</h5>
            <p class="card-text">Name: ${animal.name}</p>
            <p class="card-text">AnimalClass: ${animal.animalClass}</p>
            <p class="card-text">Diet: ${animal.diet}</p>
            <p class="card-text">Description: ${animal.description}</p>
        <a href="/animals/delete/${animalId}" class="btn btn-danger">Delete
            Animal</a>

        <a href="/animals/all" class="btn btn-primary">Go back</a>
    </div>
</div>

</div>
</body>
</html>