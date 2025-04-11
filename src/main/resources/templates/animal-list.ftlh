<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <title>Animal List</title>

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

<h1>Animals of Artic</h1>

<#list animalList as animal>
<div class="card">
    <div class="card-body">
        <h5 class="card-title">${animal.name}</h5>
        <h6 class="card-subtitle mb-2 text-body-secondary">${animal.animalClass}</h6>
        <p class="card-text">${animal.description}</p>
        <a href="/animals/${animal.animalId}" class="card-link">View</a>
    </div>
</div>
</#list>

</body>
</html>