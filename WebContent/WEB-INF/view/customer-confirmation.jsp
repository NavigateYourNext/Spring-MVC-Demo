<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation Page</title>
</head>
<body>

The Customer Confirmation Is: ${customer.firstName} ${customer.lastName} required total passes are ${customer.freePasses}

<br>

Passes will be delivered to: ${customer.postalCode} for course ${customer.courseCode}

</body>
</html>