🧪 Challenge  – Generate Fake User Profiles with Java Faker

## Challenge – Generate Fake User Profiles with Java Faker

**Objective**:  
Use the Java Faker library to create a simple app that generates and prints 10 fake user profiles. Each profile should include:

- Full Name
- Email
- Phone Number
- Address
- Job Title
- Company

---

### ✅ Instructions:

1. Add the Java Faker dependency in your `pom.xml`:

```xml
<dependency>
  <groupId>com.github.javafaker</groupId>
  <artifactId>javafaker</artifactId>
  <version>1.0.2</version>
</dependency>

Create a UserProfile.java class with fields:

String name

String email

String phone

String address

String jobTitle

String company

Create a class FakeUserGenerator.java that:

Uses Faker to generate 10 fake UserProfile instances

Prints them in readable format

Use GitHub Copilot to help you:

Auto-generate the POJO

Auto-fill values using Faker

Format and print results

🧪 Bonus:

Export the profiles to a .csv file using BufferedWriter

Generate different locale-based users (e.g., en-IND, en-US)

Create a unit test that ensures the profiles are non-null and properly formatted

📦 Example Output:

Name: John Doe
Email: john.doe@example.com
Phone: (123) 456-7890
Address: 123 Main St, Springfield
Job Title: Software Engineer
Company: Initech

...

💡 Tip:

You can explore other categories with faker.book(), faker.animal(), faker.internet() etc.

🔁 Try looping for 1000 records and writing them to a file!
