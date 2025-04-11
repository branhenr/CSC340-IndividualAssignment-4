<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <title> Animal List</title>


</head>

<body>

<ul class="nav">
    <li class="nav-item">
        <a class="nav-link active" aria-current="page" href="index.html">Main</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="about.html">About</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="details.html">Polar Bear</a>
    </li>
</ul>

<div class="container" style="margin-top: 15px;">
    <h1>create new animal</h1>
    <form id="new animal" action="/animals/new" method="post">
        <label for="name">Name</label><input type="text" id="name" name="name"/>
        <label for="diet">diet</label><input type="text" id="diet" name="diet"/>
        <label for="animalClass">animalClass</label><input type="text" id="animalClass" name="animalClass"/>
        <label for="description">description</label><input type="text" id="description" name="animalClass"/>

        <button type="submit" class="btn btn-primary">Save</button>
        <a href="/animals/all" class="btn btn-outline-danger">Cancel</a>

    </form>
</div>
</body>
</html>