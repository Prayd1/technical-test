import axios, { AxiosInstance } from "axios";
const apiClient: AxiosInstance = axios.create({
    baseURL: "http://localhost:8080",
    headers: {
        "Content-type": "application/json",
        //"Access-Control-Allow-Origin": "http://localhost:8080",
    },
});
export default apiClient;