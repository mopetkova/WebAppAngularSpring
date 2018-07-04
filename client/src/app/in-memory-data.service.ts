import {InMemoryDbService} from "../../node_modules/angular-in-memory-web-api";


export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const employees = [
      { id: 11, name: 'A'},
      { id: 12, name: 'B'},
      { id: 13, name: 'C'}
    ];
    return {employees};
  }
}
