import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { IDropdownSettings } from 'ng-multiselect-dropdown';



@Component({
  selector: 'app-order-search-screen',
  templateUrl: './order-search-screen.component.html',
  styleUrls: ['./order-search-screen.component.css']
})
export class OrderSearchScreenComponent implements OnInit {

  myForm:FormGroup;
        disabled = false;
        ShowFilter = false;
        limitSelection = false;
        cities: Array<any> = [];
        selectedItems: Array<any> = [];
        dropdownSettings: IDropdownSettings= {};
  
  constructor(private fb: FormBuilder) { }
  
  ngOnInit() {
    this.cities = [
      { id: 1, name: 'New Delhi' },
      { id: 2, name: 'Mumbai' },
      { id: 3, name: 'Bangalore' },
      { id: 4, name: 'Pune' },
      { id: 5, name: 'Chennai' },
      { id: 6, name: 'Navsari' }
  ];
  this.selectedItems = [{ id: 4, name: 'Pune' }, { id: 6, name: 'Navsari' }];
  this.dropdownSettings = {
      singleSelection: false,
      idField: 'id',
      textField: 'name',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All',
      itemsShowLimit: 3,
      allowSearchFilter: this.ShowFilter
  };
  this.myForm = this.fb.group({
      city: [this.selectedItems]
  });

  }
 
   onItemSelect(item: any) {
            console.log('onItemSelect', item);
        }
        onSelectAll(items: any) {
            console.log('onSelectAll', items);
        }
        toogleShowFilter() {
            this.ShowFilter = !this.ShowFilter;
            this.dropdownSettings = Object.assign({}, this.dropdownSettings, { allowSearchFilter: this.ShowFilter });
        }

        handleLimitSelection() {
            if (this.limitSelection) {
                this.dropdownSettings = Object.assign({}, this.dropdownSettings, { limitSelection: 2 });
            } else {
                this.dropdownSettings = Object.assign({}, this.dropdownSettings, { limitSelection: null });
            }
        }


}
