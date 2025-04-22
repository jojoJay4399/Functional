package fp;

import java.util.*;
import java.util.stream.Collectors;




public class Interview {


    public static List<Employee> generateEmployeeList() {
        List<Employee> empList = new ArrayList<>();

        // Define arrays for different attributes
        String[] departments = {"HR", "IT", "Finance", "Marketing", "Sales", "Operations", "R&D", "Legal"};
        String[] cities = {"Bangalore", "Hyderabad", "Chennai", "Noida", "Gurugram", "Pune", "Trivandrum",
                "Mumbai", "Delhi", "Kolkata", "Ahmedabad", "Jaipur", "Bhopal", "Indore"};
        String[] genders = {"M", "F"};

        // Generate 100 employees
        for (int i = 1; i <= 100; i++) {
            // Generate random values
            int age = 22 + (int)(Math.random() * 15); // Age between 22 and 36
            int salary = 100000 + (int)(Math.random() * 100000); // Salary between 100000 and 200000
            String gender = genders[(int)(Math.random() * genders.length)];
            String department = departments[(int)(Math.random() * departments.length)];
            String city = cities[(int)(Math.random() * cities.length)];
            int joiningYear = 2010 + (int)(Math.random() * 11); // Years between 2010 and 2020

            // Generate name (using a combination of letters)
            String name = generateName();

            // Create and add employee
            empList.add(new Employee(i, name, age, salary, gender, department, city, joiningYear));
        }

        return empList;
    }

    // Helper method to generate random names
    private static String generateName() {
        String[] firstNames = {"John", "Jane", "Michael", "Sarah", "David", "Emma", "James", "Olivia",
                "William", "Sophia", "Robert", "Ava", "Joseph", "Isabella", "Thomas",
                "Mia", "Daniel", "Charlotte", "Matthew", "Amelia", "Andrew", "Harper",
                "Joshua", "Evelyn", "Christopher", "Abigail", "Anthony", "Emily",
                "Jonathan", "Elizabeth", "Ryan", "Sofia", "Nicholas", "Madison",
                "Kevin", "Avery", "Brian", "Ella", "George", "Scarlett", "Timothy",
                "Victoria", "Ronald", "Maya", "Edward", "Chloe", "Jason", "Penelope",
                "Jeffrey", "Layla", "Richard", "Zoey", "Patrick", "Nora", "Alexander",
                "Lily", "Jeremy", "Eleanor", "Henry", "Hannah", "Sebastian", "Lillian",
                "Jack", "Addison", "Owen", "Aubrey", "Gabriel", "Ellie", "Julian",
                "Stella", "Wyatt", "Natalie", "Luke", "Zoe", "Jayden", "Hazel",
                "Nathan", "Audrey", "Isaac", "Bella", "Hunter", "Claire", "Christian",
                "Skylar", "Mason", "Lucy", "Aaron", "Anna", "Charles", "Sadie",
                "Eli", "Alexa", "Colton", "Ariana", "Adrian", "Allison", "Nolan",
                "Anna", "Cameron", "Aurora", "Blake", "Ellie", "Carlos", "Arianna",
                "Ian", "Eliana", "Kai", "Maya", "Dominic", "Keira", "Austin", "Freya",
                "Adam", "Iris", "Xavier", "Emerson", "Jose", "Callie", "Jace", "Sage",
                "Brayden", "Jade", "Cooper", "Morgan", "Kevin", "Luna", "Tyler", "Willow",
                "Caleb", "Juniper", "Asher", "Lydia", "Jaxson", "Lila", "Jasper", "Hadley",
                "Miles", "Rosalie", "Maxwell", "Sienna", "Ryder", "Nina", "Micah", "Harlow",
                "Declan", "Miriam", "Damian", "Diana", "Gavin", "Georgia", "Carson", "Daisy",
                "Easton", "Olive", "Colin", "Ainsley", "Chase", "Elodie", "Kayden", "Margot",
                "Maddox", "Mabel", "Justin", "Millie", "Parker", "Maisie", "Ryker", "Pearl",
                "Axel", "Sylvie", "Jett", "Nellie", "Kai", "Winnie", "Beau", "Nola", "Finn",
                "Ruth", "Graham", "Hattie", "Zayden", "Nadine", "River", "Opal", "Amari",
                "Lennon", "Talia", "Rhett", "Marilyn", "Zion", "Eileen", "Brett", "Lorelei",
                "Amir", "Adaline", "Kameron", "Saylor", "Allen", "Kensley", "Cairo", "Elina",
                "Crew", "Malayah", "Baker", "Malaya", "Jax", "Novalee", "Ronan", "Rosalyn",
                "Hendrix", "Alma", "Jagger", "Briar", "Khalil", "Helena", "Atlas", "Blaire",
                "Marvin", "Alora", "Casey", "Claudia", "Caspian", "Myra", "Lennox", "Tatiana",
                "Quinn", "Samara", "Kannon", "Waverly", "Monroe", "Emmaline", "Kairo", "Sierra",
                "Nash", "Ailani", "Ridge", "Milani", "Jerry", "Alaiya", "Fletcher", "Veda",
                "Ramon", "Giana", "Boston", "Wendy", "Luis", "Cynthia", "Weston", "Leona",
                "Bo", "Emmy", "Byron", "Anya", "Amias", "Blake", "Jimmy", "Flora", "Alvaro",
                "Violeta", "Cory", "Maeve", "Dennis", "Rosalina", "Clay", "Kylie", "Malcolm",
                "Sloane", "Koda", "Bridget", "Krew", "Lilith", "Niko", "Mariam", "Wilson",
                "Emmie", "Kendrick", "Lennie", "Lamar", "Melanie", "Mario", "Pearl", "Noah",
                "Yisroel", "Edgar", "Yara", "Erik", "Linda", "Raphael", "Lina", "Izaiah",
                "Luciana", "Colten", "Mavis", "Elisha", "Calliope", "Gunner", "Simone",
                "Kendall", "Murphy", "Prince", "Darcy", "Zachariah", "Shiloh", "Ahmad",
                "Louisa", "Calvin", "Bellamy", "Nelson", "Coraline", "Drew", "Yasmine",
                "Jimmy", "Tinsley", "Kian", "Poppy", "Vincenzo", "Marlowe", "Cillian",
                "Zaria", "Nathanael", "Constance", "Danny", "Dhalia", "Thaddeus", "Etta",
                "Keenan", "Malayah", "Lennon", "Amoura", "Rohan", "Hunter", "Kristian",
                "Jericho", "Elio", "Khari", "Giorgio", "Zola", "Izayah", "Liv", "Decker",
                "Rayna", "Bentley", "Aliza", "Carl", "Malani", "Kylo", "Halo", "Nixon",
                "Nala", "Tyrone", "Promise", "Vance", "Justice", "Issac", "Chevelle",
                "Jarvis", "Indie", "Ernesto", "Zaniyah", "Jaziel", "Weslie", "Jordy",
                "Evalyn", "Larry", "Fiora", "Stanley", "Yelena", "Titan", "Alianna",
                "Creed", "Paisleigh", "Kylan", "Lexi", "Neil", "Zora", "Rex", "Maren",
                "Ahmed", "Monroe", "Wilson", "Sandra", "Javion", "Wynter", "Jefferson",
                "Mae", "Ray", "Kaitlyn", "Kashton", "Naya", "Salvador", "Wanda", "Cullen",
                "Halo", "Brock", "Lynn", "Dakari", "Rosalind", "Duke", "Sariyah", "Howard",
                "Ramona", "Douglas", "Berkley", "Roland", "Harlyn", "Uriel", "Luella",
                "Ace", "Rayne", "Dax", "Bexley", "Kingsley", "Katalina", "Skyler", "Antonella",
                "Rudy", "Zelda", "Grey", "Novah", "Gatlin", "Ellis", "Huxley", "Reverie",
                "Ishaan", "Florence", "Vivaan", "Marlowe", "Yehuda", "Winslow", "Darren",
                "Ursula", "Soren", "Aarna", "Dario", "Kingsley", "Donald", "Emmeline",
                "Fitzgerald", "Kallie", "Gerry", "Luisa", "Kace", "Tzipora", "Arlo", "Ara",
                "Gustavo", "Henley", "Flynn", "Mavis", "Jagger", "Calliope", "Armani",
                "Skylar", "Deacon", "Catrina", "Eden", "Persephone", "Valentino", "Martha",
                "Jovanni", "Mazikeen", "Salem", "Reina", "Vicente", "Briar", "Korbin",
                "Luella", "Dash", "Taytum", "Jericho", "Mireya", "Fox", "Noor", "Howard",
                "Briana", "Alaric", "Cleo", "Gerald", "Margo", "Khalid", "Zahara", "Hezekiah",
                "Kora", "Nikolai", "Zaylee", "Yahir", "Egypt", "Zain", "Mariyah", "Karter",
                "Penny", "Leroy", "Noor", "Leonel", "Amayah", "Tresean", "Meredith",
                "Watson", "Maxine", "Yosef", "Clover", "Yusuf", "Denver", "Zaid", "Emmie",
                "Cedric", "Loyalty", "Hassan", "Mina", "Kannon", "Scotlyn", "Colson", "Khalani",
                "Truett", "Celeste", "Otis", "Nala", "Maurice", "Promise", "Maxim", "Justice",
                "Barry", "Mavis", "Byron", "Calliope", "Aryan", "Chevelle", "Dorian", "Egypt",
                "Gerald", "Fiora", "Hassan", "Hunter", "Jagger", "Indie", "Jaziel", "Kaitlyn",
                "Jordy", "Kora", "Kylan", "Lexi", "Kylo", "Lynn", "Larry", "Mae", "Neil",
                "Naya", "Rex", "Paisleigh", "Roland", "Ramona", "Salvador", "Rosalind",
                "Stanley", "Sariyah", "Titan", "Taytum", "Uriel", "Wanda", "Vance", "Wynter",
                "Wilson", "Yelena", "Yusuf", "Zahara", "Zain", "Zaniyah", "Zaylee", "Zelda"};

        return firstNames[(int)(Math.random() * firstNames.length)];
    }


    public static void main(String[] args) {
        // Generate employee List
        List<Employee> employeeList = generateEmployeeList();

        int i = 1;
        // TODO: Question 1: Group the employees by the city
        System.out.println("The result of Question " + i);
        Map<String, List<Employee>> employeeListByCity1 = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.city)); // same with Collectors.groupingBy(e -> e.city) = Collectors.groupingBy(fp.Employee::getCity)

        Map<String, List<Employee>> employeeListByCity2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(employeeListByCity1.equals(employeeListByCity2) + "\n");
        i++;


        // TODO: Question 2: Find the count of male and female employees present in the organization.
        System.out.println("The result of Question " + i);
        Map<String, Long> numOfGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(numOfGender + "\n");
        i++;

        // TODO: Question 3: Print the names of all departments in the organization.
        System.out.println("The result of Question " + i);
        employeeList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
        System.out.println(" ");
        i++;

        // TODO: Question 4: Print employee details whose age is greater than 28.
        System.out.println("The result of Question " + i);
        employeeList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(" ");
        i++;

        // TODO: Question 5: Get maximum age of employee
        System.out.println("The result of Question " + i);
        OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
        System.out.println(max.getAsInt() + "\n");
        i++;
        /**
        // Using map instead of mapToInt (less efficient)
        Optional<Integer> maxAge = employeeList.stream()
                .map(fp.Employee::getAge)
                .max(Integer::compareTo);

        // Using reduce (more verbose)
        OptionalInt maxAge = employeeList.stream()
                .mapToInt(fp.Employee::getAge)
                .reduce(Integer::max);
         */

        // TODO: Question 5-1: Get the employee with maximum age
        Optional<Employee> oldestEmployee1 = employeeList.stream().max(Comparator.comparing(employee -> employee.age));

        Optional<Employee> oldestEmployee2 = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst();

        System.out.println(oldestEmployee1.equals(oldestEmployee2));

        // TODO: Question 6: Print Average age of Male and Female Employees.
        Map<String, Double> avgAge = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));

        System.out.println(avgAge);


        // TODO Question 7: Find youngest female employee
        Optional<Employee> youngestFemale = employeeList.stream()
                .filter(e -> e.getGender().equals("F"))
                .min(Comparator.comparing(Employee::getAge));

        Employee yf = youngestFemale.get();


        // TODO Question 8: Find employees whose age is greater than 20 and less than 30.

        /** Introduction
         *
         */
        Map<Boolean, List<Employee>> ageGroups = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getAge() >= 30));
        List<Employee> oldThan30 = ageGroups.get(true);
        List<Employee> youngThan30 = ageGroups.get(false);


        List<Employee> employeesBetween20And30 = employeeList.stream()
                .filter(employee -> employee.getAge() >= 21 && employee.getAge() <= 30)
                .collect(Collectors.toList());



        // TODO Question 9: Find the department name which has the highest number of employees
        String departWithMostEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,  Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No department found");

        Map<String, Long> countByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,  Collectors.counting()));
        System.out.println(countByDepartment);
        System.out.println(departWithMostEmployees);


        // TODO: Question 10: Find if there any employees from HR department
        Optional<Employee> employeeFromHR = employeeList.stream()
                .filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny();

        if(employeeFromHR.isPresent()) {
            System.out.println(employeeFromHR.get());
        }


        // TODO: Question 11: Find the department names that these employees work for, where the number of employees in the department is over 3.
        System.out.println("The result of Question " + i);
        List<String> departList = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(departList);

        // print department with the number
        Map<String, Long> dept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println(dept + "\n");
        i++;



        // TODO: Question 12:  Find distinct department names that employees work for.
        System.out.println("The result of Question " + i);
        List<String> departments = employeeList.stream()
                .map(Employee::getDeptName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(departments + "\n");
        i++;


        // TODO: Question 13: Find all employees who lives in ‘Bangalore’ city, sort them by their name and print the names of employees
        System.out.println("The result of Question " + i);
        List<Employee> employeesInBlore = employeeList.stream()
                .filter(e -> e.getCity().equalsIgnoreCase("Bangalore"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(employeesInBlore + "\n");
        i++;

        // TODO: Question 14: Sorting a Stream by age and name fields.
        System.out.println("The result of Question " + i);

//        /**
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
        Comparator<Employee> nameAndAgeComparator = nameComparator.thenComparing(ageComparator);

        List<Employee> sortedEmployee1 = employeeList.stream()
                .sorted(nameAndAgeComparator)
                .collect(Collectors.toList());
//         */

        Comparator<Employee> newComparator = (e1, e2) -> {
          int nameCompare = e1.getName().compareTo(e2.getName());
          return nameCompare != 0 ? nameCompare : e1.getAge() - e2.getAge();
        };


        List<Employee> sortedEmployee2 = employeeList.stream()
                .sorted(nameAndAgeComparator)
                .collect(Collectors.toList());


        System.out.println(sortedEmployee2.equals(sortedEmployee1) + "\n");

        i++;


        // TODO: Question 15: Highest experienced employees in the organization.

        // Method 1:
        int year = employeeList.stream()
                .mapToInt(Employee::getYearOfJoining)
                .min()
                .orElse(-1);
        if (year != -1) {
            List<Employee> highExperiencedEmployees = employeeList.stream()
                    .filter(e -> e.getYearOfJoining() == year)
                    .collect(Collectors.toList());
            System.out.println(highExperiencedEmployees + "\n");
        }

        // Method 2:
        List<Employee> highExperiencedEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getYearOfJoining))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .orElse(Collections.emptyList());

        i++;
        //System.out.println(hi);


        // TODO: Question 16: Find top 5 most experienced employees
        List<Employee> top5Experienced = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining))
                .limit(5)
                .collect(Collectors.toList());


        // TODO: Question 16-1: find highest experienced employees by department:
        Map<String, Employee> deptWiseMostExperienced = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDeptName,
                        Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().orElse(null)
                ));

        Map<String, List<Employee>> deptWiseMostExperienced2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> {
                            // Find earliest joining year in this department
                            int earliestYear = entry.getValue().stream()
                                    .mapToInt(Employee::getYearOfJoining)
                                    .min()
                                    .orElse(0);

                            // Get all employees who joined in the earliest year
                            return entry.getValue().stream()
                                    .filter(emp -> emp.getYearOfJoining() == earliestYear)
                                    .collect(Collectors.toList());
                        }
                ));




        // TODO: Question 17: Print average and total salary of the organization.



        // TODO: Question 18: Print Average salary of each department.



        // TODO: Question 19: Find Highest salary in the organisation.




        // TODO: Question 20:  Find Second Highest salary in the organisation.




        // TODO: Question 21: Find Nth Highest salary.



        // TODO: Question 22: Find highest paid salary in the organisation based on gender.


        // TODO: Question 23: Find lowest paid salary in the organisation based in the organisation.



        // TODO: Question 24: Sort the employees salary in the organisation in ascending order



        // TODO: Question 25: Sort the employees salary in the organisation in descending order.



        // TODO: Question 26: Highest salary based on department.



        // TODO: Question 27:  Print list of employee’s second highest record based on department


        // TODO: Question 28: Sort the employees salary in each department in ascending order


        // TODO: Question 29:  Sort the employees salary in each department in descending order


        // TODO: Question 30:



        // TODO: Question 31



        // TODO: Question 32



        // TODO: Question 33



        // TODO: Question 34












//        List<fp.Car> carsList = new ArrayList<>();
//
//        String[] years = {"1987", "2010", "2024"};
//        String[] vins = {"XXX", "YYY", "ZZZ"};
//        String[] owners = {"John", "Zed", "Chris"};
//
//
//        for (int i = 0; i < years.length; i++) {
//            carsList.add(new fp.Car(years[i], vins[i], owners[i]));
//        }
//
//        //List<fp.Car> resCars = carsList.stre
//        // carsList.forEach(c -> System.out.println(c.toString()));
//
//        List<fp.Car> resCars = carsList.stream()
//                .filter(c -> (2025 - Integer.parseInt(c.make)) < 30)
//                .sorted(Comparator.comparing(c -> c.owner))
//                .collect(Collectors.toList());
//        System.out.println(resCars);
    }

}
