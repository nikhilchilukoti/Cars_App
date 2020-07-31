import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CarSeries } from 'src/app/model/CarSeries';
import { map } from 'rxjs/operators';
import { Accessories } from 'src/app/model/Accessories';
import { CarModels } from 'src/app/model/CarModels';
import { Colors } from 'src/app/model/Colors';
import { Observable } from 'rxjs';
import { links } from 'src/app/URL/Links';
import { SaveData } from 'src/app/model/SaveData';

@Injectable({
  providedIn: 'root'
})
export class CarsServiceService {

  constructor( private http:HttpClient) { }



  retrieveAllCarSeries():Observable<any>{
    return this.http.get(links.seriesUrl).pipe(map(
        (data:any)=>{
            return data;
        }
    ));
}



  retrieveAllCarSeriesModels(id) {
    return this.http.get<CarModels[]>(`http://localhost:8091/getsm/getmodels/${id}`);
    
  }

 
    

  retrieveAllCarAccessories(id) {
    return this.http.get<Accessories[]>(`http://localhost:8092/getaccessories/getaccessory/${id}`);
    
  }

  retreiveAllCarColors(id) {
    return this.http.get<Colors[]>(`http://localhost:8093/getcolors/allcolors/${id}`);
  }



  
  public saveOrder(requestData):Observable<any>{
    return this.http.post<SaveData[]>("http://localhost:8094/save",requestData).pipe(map(
      (data:any)=>{
          return data;
      }
  ))
}

}
