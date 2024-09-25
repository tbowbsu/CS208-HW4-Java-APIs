package cs208;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController
{
    // TODO: create a GET route with two query parameters
    @GetMapping("/display_name")
    String getSearchWithTwoParameters(
            @RequestParam("first_name") String firstName,
            @RequestParam("last_name") String lastName
    )
    {
        System.out.println("PracticeController.getSearchWithTwoParameters - START");
        System.out.println("first name sent in the browser URL = " + firstName);
        System.out.println("last name sent in the browser URL = " + lastName);
        System.out.println("PracticeController.getSearchWithTwoParameters - END");

        String valueReturnedToBrowser =
                "These are the values of parameters passed in the URL:<br>" +
                        "parameter1 = " + firstName + "<br>" +
                        "parameter2 = " + lastName + "<br><br>" +
                        "NOTE: the parameters are separated in the URL by an ampersand (&amp;) character.<br><br>" +
                        "<hr>";
                        //"Find me in the TutorialController.getSearchWithTwoParameters() method";

        return valueReturnedToBrowser;
    }


    // TODO: create a GET route with a path parameter
    // NOTE:
    //   - {issue_id} is a PathVariable (i.e., path parameter), not a RequestParam (i.e., query parameter)
    //   - any value after "/issues_with_string_path_variable/" that is passed in the URL will be assigned to the {issue_id} variable
    @GetMapping("/user/{user_name}/profile")
    String getPersonWithStringPathVariableCalledUserName(@PathVariable("user_name") String user_name)
    {
        System.out.println("PracticeController.getPersonWithStringPathVariableCalledUserName - START");
        System.out.println("Parameter received in the path of the URL:");
        System.out.println("user_name = " + user_name);
        System.out.println("PracticeController.getPersonWithStringPathVariableCalledUserName - END");

        String valueReturnedToBrowser =
                "Parameter received in the path of the URL:<br>" +
                        "user_name = " + user_name + "<br><br>" +
                        "<hr>";
                        //"Find me in the TutorialController.getIssuesWithStringPathVariableCalledIssueId() method";

        return valueReturnedToBrowser;
    }


    // TODO: create a POST route with two form parameters


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
