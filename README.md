# Project Name
This is a brief description of the project, including the main technologies used and its core functionality.

## Table of Contents
- [Features](#features)
- [Setup and Run Instructions](#setup-and-run-instructions)
- [Usage](#usage)
- [Assumptions and Decisions](#assumptions-and-decisions)
- [Screenshots](#screenshots)
- [API Reference](#api-reference)
- [Technologies Used](#technologies-used)

## Features
- **Feature 1**: Fetching data from openWeather.
- **Feature 2**: Caching request for faster access using redis.

## Setup and Run Instructions
1. **Clone the repository:**
   ```bash
   git clone https://github.com/shubham007kumar/openweather-backend.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd src/main/java/dev/shubham/openweather
   ```

3. **API Key (if applicable):**
   - Add key value in environment variable
     ``` env
     weather_api_key=b261351e7f694ddca7391249fe256d3c
     ```

4. **Run the application:**
   - Run Redis server.
   - Run the `OpenWeatherApplication.java` file.

## Usage
- **Feature 1**: Implement all api through interface so that in future if we need other client so it will we easy to implement.

### Interaction
- Before running frontend code First run Redis server then spring boot application for serving api for frontend

## API Reference ( If you are also exposing and API, add details here )
- **API Provider Name**:
  - **Endpoint 1**: This api is used for fetch current city weather
    ```
    http://127.0.0.1/weather
    ```
  - **Endpoint 2**:  This api is used for fetch Forecast weather
    ```
    http://127.0.0.1/forecast
    ```

## Technologies Used
- **Backend (if applicable)**: Spring boot
- **APIs**: '/weather','/forecast'
- **Other**: Redis
