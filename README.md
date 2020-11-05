******************** WCF APPLICATION *************************
Front End of the application:
1. Install "node".
2. Install "Angular cli"
3. Navigate to WcfFrontEnd in terminal
4. Run "ng s"


Back End of the application
1. Open in Intellij or any other IDE.
2. Install mysql database
3. Before running navigate to application.yml file and make sure you give your mysql configurations.
4. Navigate to "src/main.java/com.WCF.WCF.WcfApplication.java" file and run "main"

Postman
1. If you are testing using back end "http://localhost:8765/v1/wcf/status" to get status of application 
2. To call saveData method url: "http://localhost:8765/v1/wcf/saveData" Request Body: 
{
    "title":"saikrishnapvn@gmail.com",
    "description":"121323",
    "client": "wuqagdiuwqa",
    "clientPriority": "ABC124",
    "targetDate": "54154",
    "productArea": "54654"
}
