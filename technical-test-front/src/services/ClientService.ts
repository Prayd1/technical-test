import http from "@/http-common";

class ClientService {
    getClients(): Promise<any> {
        return http.get("/findAllClients");
    }
}

export default new ClientService();