# Java Design Patterns (Udemy)

Repositorio de practica para implementar principios SOLID y patrones de diseno en Java.

## Estado actual

Actualmente el proyecto incluye un ejemplo del principio de responsabilidad unica (SRP):

- `com.designpattern.srp.SingleResponsibilityPrincipe`

## Estructura

```text
src/
  main/
    java/
      com/
        designpattern/
          srp/
            SingleResponsibilityPrincipe.java
```

## Requisitos

- Java 11 o superior
- VS Code con Extension Pack for Java (opcional)

## Ejecutar desde VS Code

1. Abre el archivo `src/main/java/com/designpattern/srp/SingleResponsibilityPrincipe.java`.
2. Usa el boton **Run** sobre el metodo `main`.

## Ejecutar desde terminal

Si ya compilaste en VS Code (JDT), puedes ejecutar con el classpath generado por el IDE:

```bash
/usr/bin/env /usr/local/Cellar/openjdk@11/11.0.25/libexec/openjdk.jdk/Contents/Home/bin/java -cp "/Users/admin/Library/Application Support/Code/User/workspaceStorage/a1301e3f701d9d1a46f90c900cd73abc/redhat.java/jdt_ws/Java-DesignPattern-Udemy_3ec07d4a/bin" com.designpattern.srp.SingleResponsibilityPrincipe
```

## Convencion de commits

Se usa Conventional Commits. Ejemplos:

- `feat(srp): add message printer abstraction`
- `fix(srp): correct package path mismatch`
- `chore(git): add java gitignore`

## Proximos pasos sugeridos

- Agregar nuevas carpetas por principio/patron (`ocp`, `lsp`, `factory`, `strategy`, etc.).
- Separar interfaces y clases en archivos independientes.
- Incorporar pruebas unitarias con JUnit 5.
