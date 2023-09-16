package tesla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tesla", "root", "");
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return;
        }
        
        ClienteDAO clienteDAO = new ClienteDAO(connection);
        CocheDAO cocheDAO = new CocheDAO(connection);
        RevisionDAO revisionDAO = new RevisionDAO(connection);
        
        while (true) {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Obtener Todos los Clientes");
            System.out.println("3. Agregar Coche");
            System.out.println("4. Obtener Todos los Coches");
            System.out.println("5. Agregar Revisión");
            System.out.println("6. Obtener Todas las Revisiones");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            
            scanner.nextLine(); // Consumir el salto de línea
            
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("=== Agregar Cliente ===");
                        System.out.print("Código de Cliente: ");
                        int codCliente = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        System.out.print("NIF: ");
                        String nif = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellidos: ");
                        String apellidos = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        int telefono = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        System.out.print("Dirección: ");
                        String direccion = scanner.nextLine();
                        System.out.print("Código Postal: ");
                        int cp = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        clienteDAO.agregarCliente(codCliente, nif, nombre, apellidos, telefono, direccion, cp);
                        System.out.println("Cliente agregado con éxito.");
                        break;
                    case 2:
                        System.out.println("=== Obtener Todos los Clientes ===");
                        List<Cliente> clientes = clienteDAO.obtenerTodosClientes();
                        System.out.println("Lista de Clientes:");
                        for (Cliente cliente : clientes) {
                            System.out.println(cliente);
                        }
                        break;
                    case 3:
                        System.out.println("=== Agregar Coche ===");
                        System.out.print("Matrícula: ");
                        String matricula = scanner.nextLine();
                        System.out.print("Color: ");
                        String color = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();
                        scanner.nextLine(); // Consumir el salto de línea
                        System.out.print("Código de Cliente: ");
                        int codClienteCoche = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        cocheDAO.agregarCoche(matricula, color, modelo, marca, precio, codClienteCoche);
                        System.out.println("Coche agregado con éxito.");
                        break;
                    case 4:
                        System.out.println("=== Obtener Todos los Coches ===");
                        List<Coche> coches = cocheDAO.obtenerTodosCoches();
                        System.out.println("Lista de Coches:");
                        for (Coche coche : coches) {
                            System.out.println(coche);
                        }
                        break;
                    case 5:
                        System.out.println("=== Agregar Revisión ===");
                        System.out.print("Código Interno: ");
                        int codInterno = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        System.out.print("Matrícula del Coche: ");
                        String matricularevision = scanner.nextLine();
                        System.out.print("Cambio de Filtro (S/N): ");
                        String cambioFiltro = scanner.nextLine();
                        System.out.print("Cambio de Aceite (S/N): ");
                        String cambioAceite = scanner.nextLine();
                        System.out.print("Cambio de Frenos (S/N): ");
                        String cambioFrenos = scanner.nextLine();
                        System.out.print("Cambio de Otros (S/N): ");
                        String cambioOtros = scanner.nextLine();
                        System.out.print("Fecha de la Revisión (YYYY-MM-DD): ");
                        String fechaRevisionStr = scanner.nextLine();
                        LocalDate fechaRevision = LocalDate.now();
                        revisionDAO.agregarRevision(codInterno, cambioFiltro, cambioAceite, cambioFrenos, cambioOtros, fechaRevision, matricularevision);
                        System.out.println("Revisión agregada con éxito.");
                        break;
                    case 6:
                        System.out.println("=== Obtener Todas las Revisiones ===");
                        List<Revision> revisiones = revisionDAO.obtenerTodasRevisiones();
                        System.out.println("Lista de Revisiones:");
                        for (Revision revision : revisiones) {
                            System.out.println(revision);
                        }
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        return;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            } catch (SQLException e) {
                System.out.println("Error en la ejecución de la operación: " + e.getMessage());
            }
            
            System.out.println(); // Línea en blanco para separar las iteraciones del menú
        }
    }
}

