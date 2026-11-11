<!-- Agregar las url de la aplicación -->

<c:set var="urlInicio">
    <c:url value="${application.contextPath}/" />
</c:set>

<c:set var="urlAgregar">
    <c:url value="${application.contextPath}/agregar" />
</c:set>

<div class="container">
        <nav class="navbar md:navbar-expand bg-primary" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="${urlInicio}">Sistema de Empleados</a>
                <button class="btn-icon navbar-toggler" type="button" data-bs-toggle="drawer" data-bs-target="#navbarDrawer" aria-controls="navbarDrawer" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon" aria-hidden="true"></span>
                </button>
                <dialog class="drawer drawer-end" tabindex="-1" id="navbarDrawer" aria-labelledby="navbarDrawerLabel">
                    <div class="drawer-header">
                        <h5 class="drawer-title" id="navbarDrawerLabel">Menu</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="drawer" aria-label="Close"></button>
                    </div>
                    <div class="drawer-body mb-2 md:mb-0">
                        <ul class="nav navbar-nav me-auto">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="/empleados">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="${urlAgregar}">Agregar Empleado</a>
                            </li>
                        </ul>
                    </div>
                </dialog>
            </div>
        </nav>
    </div>