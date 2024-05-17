<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Dropdown
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Action</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-8">
                    <table class="table table-bordered">
                        <thead class="bg-primary text-white">
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Phone</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>
                                <th>Zip</th>
                                <th>Contract</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="a" items="${list}">
                                <tr>
                                    <td>${a.authorId}</td>
                                    <td>${a.authorLastname} ${a.authorFirstname}</td>
                                    <td>${a.phone}</td>
                                    <td>${a.address}</td>
                                    <td>${a.city}</td>
                                    <td>${a.state}</td>
                                    <td>${a.zip}</td>
                                    <td>${a.contract}</td>
                                    <td>
                                        <a href="updateAuthor?id=${a.authorId}" class="btn btn-danger">Detail</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
                <div class="col-4">
                    <form action="updateAuthor" method="post">
                        <div class="mb-3">
                            <label for="exampleFormControlInput1" class="form-label">Id</label>
                            <input type="text" class="form-control" id="Id" name="Id" value="${a.authorId}" placeholder="ID: format xxx-xx-xxxx">
                        </div>

                        <div class="row">
                            <div class="mb-3 col-6">
                                <label for="firstName" class="form-label">First Name</label>
                                <input type="text" class="form-control" id="firstName" name="firstName" value="${a.authorFirstname}" placeholder="First Name">
                            </div>
                            <div class="mb-3 col-6">
                                <label for="lastName" class="form-label">Last Name</label>
                                <input type="text" class="form-control" id="lastName" name="lastName" value="${a.authorLastname}" placeholder="Last Name">
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="Phone" class="form-label">Phone</label>
                            <input type="text" class="form-control" id="Phone" name="phone" value="${a.phone}" placeholder="ID: format xxx xxx-xxxx">
                        </div>
                        <div class="row">
                            <div class="mb-3 col-4">
                                <label for="Address" class="form-label">Address</label>
                                <input type="text" class="form-control" id="Address" name="address" value="${a.address}" placeholder="Address">
                            </div>
                            <div class="mb-3 col-4">
                                <label for="City" class="form-label">City</label>
                                <input type="text" class="form-control" id="lastName" name="city" value="${a.city}" placeholder="city">
                            </div>
                            <div class="mb-3 col-4">
                                <label for="State" class="form-label">State</label>
                                <input class="form-control" list="datalistOptions" id="State" name="state" value="${a.state}" placeholder="Type to search...">
                                <datalist id="datalistOptions">
                                    <option value="CA">
                                    <option value="KS">
                                    <option value="TN">
                                    <option value="OR">
                                    <option value="MI">
                                </datalist>
                            </div>
                            <div class="row">
                                <div class="mb-3 col-6">
                                    <label for="Zip" class="form-label">Zip</label>
                                    <input type="number" class="form-control" id="Zip" name="zip" value="${a.zip}" min="10000" max="99999" placeholder="Zip">
                                </div>
                                <div class="mb-3 col-6">
                                    <label for="Zip" class="form-label">Contract</label>
                                    </br>
                                    <input class="form-check-input" type="checkbox" value="${a.contract}" name="contract" ${a.contract?"checked":""} id="flexCheckDefault">
                                    <label class="form-check-label" for="flexCheckChecked">
                                        IsContract
                                    </label>
                                </div>
                            </div>
                            <div class="mb-3">
                                <input type="submit" class="btn btn-success" value="Update"  />
                            </div>
                        </div>
                    </form>
                </div>

            </div>

        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
