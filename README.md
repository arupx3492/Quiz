# Quiz
# Quiz_Servise

#  QuizSystem  REST API Documentation
This documentation provides an overview of the endpoints available in the  Quiz System API.

## Base URL
The base URL for accessing the API is: https://quizsystem-production.up.railway.app/quizzes
### Quiz Resource
### Create a Quiz
   - URL: https://quizsystem-production.up.railway.app/quizzes

   - Method: POST

   - Description: Create a new quiz.

   - Request Body:


    {

        "question": "What is your village Name?",
        "options": ["Jargaria", "Kurarbaid", "Boro", "Purulia"],
        "rightAnswerIndex": 0,
        "startDate": "2023-05-16T09:35",
        "endDate": "2023-05-16T09:40"

    }

       Response Body:


    {
        "id": 1,
        "question": "What is your village Name?",
        "options": ["Jargaria", "Kurarbaid", "Boro", "Purulia"],
        "rightAnswerIndex": 0,
        "startDate": "2023-05-16T09:35",
        "endDate": "2023-05-16T09:40",
        "status": "INACTIVE"
    }
 ###  Get Active Quizzes
   - URL: https://quizsystem-production.up.railway.app/quizzes/active

   - Method: GET

   - Description: Get a list of active quizzes (quizzes that are currently within their start and end time).

   - Response Body:


    [
        {
            "id": 1,
            "question": "What is your village Name?",
            "options": ["Jargaria", "Kurarbaid", "Boro", "Purulia"],
            "rightAnswerIndex": 0,
            "startDate": "2023-05-16T09:35",
            "endDate": "2023-05-16T09:40",
            "status": "ACTIVE"
        },
        ...
    ]
   ### Get Quiz Result
   -  URL: https://quizsystem-production.up.railway.app/quizzes/{id}/result

   -  Method: GET

   - Description: Get the result of a quiz by its ID.

   - Path Variable:

   - {id}: ID of the quiz
   - Response Body:

         {
          "question": "Which planet is known as the \"Red Planet\"?",
          "options": [
              "Mercury",
              "Venus",
              "Mars",
              "Jupiter"
          ],
          "answer": "Mars"
      }
### Get All Quizzes
   - URL: https://quizsystem-production.up.railway.app/quizzes/all

   - Method: GET

   - Description: Get a list of all quizzes.

   - Response Body:
    
          {
              "id": 1,
              "question": "What is your village Name?",
              "options": ["Jargaria", "Kurarbaid", "Boro", "Purulia"],
              "rightAnswerIndex": 0,
              "startDate": "2023-05-16T09:35",
              "endDate": "2023-05-16T09:40",
              "status": "INACTIVE"
          }...
        

