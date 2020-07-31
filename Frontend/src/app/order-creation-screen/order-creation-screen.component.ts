import { Component, OnInit, ɵConsole } from '@angular/core';
import { CarSeries } from '../model/CarSeries';
import { CarModels } from '../model/CarModels';
import { Accessories } from '../model/Accessories';
import { Colors } from '../model/Colors';
import { CarsServiceService } from '../service/data/cars-service.service';
import { Router } from '@angular/router';
import { SaveData } from '../model/SaveData';
import { Converter } from '../Converter';

@Component({
  selector: 'app-order-creation-screen',
  templateUrl: './order-creation-screen.component.html',
  styleUrls: ['./order-creation-screen.component.css'],
})
export class OrderCreationScreenComponent implements OnInit {
  accessorySum: number;
  modelAmount: number;
  grandTotal: number;

  seriesList: CarSeries[];
  modelList: CarModels[];
  accessoriesList: Accessories[];
  colorsList: Colors[];

  accessoriesDropdownSettings = {};
  colorsDropdownSettings = {};

  selectedSeriesId: any;
  selectedModelId: any;

  selectedItems1 = [];
  selectedItems2 = [];

  public accessoryList: Accessories[] = [];
  public colorList: Colors[] = [];

  seriesId: any;
  modelId: number;

  //separate array
  public AccessoryIdList = [];
  public colorIdList = [];

  public accyObj = [];
  public arrayAccessories = [];
  public colorObj = [];
  public arrayColors = [];


  success: string;
  AccessoryPrice: number;
  ColorPrice: any;
  ModelPrice: any;

  colorPrice1: number = 0;
  modelPrice1: number = 0;
  totalPrice: number;
  accessPrice1: number = 0;
  isDeSelectedAccessory: boolean;
  isDeselectedColor: boolean;
  constructor(private carsService: CarsServiceService, private router: Router) { }
  ngOnInit() {
    this.accessoriesDropdownSettings = {
      singleSelection: false,
      idField: 'accessories_id',
      textField: 'accessories_name',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All',
      enableCheckAll: false,
      itemsShowLimit: 3,
      allowSearchFilter: false
    };
    this.colorsDropdownSettings = {
      singleSelection: false,
      idField: 'colors_id',
      textField: 'colors_name',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All',
      enableCheckAll: false,
      itemsShowLimit: 3,
      allowSearchFilter: false
    };
    this.getCarSeries();
  }
  //get car series
  getCarSeries() {
    this.carsService.retrieveAllCarSeries().subscribe((data: CarSeries[]) => {
      this.seriesList = data;
    });
  }
  public getSeriesId(event: any) {
    this.selectedSeriesId = event.target.value;
    this.getCarModels();
  }
  //getcar series
  getCarModels() {
    this.seriesId = this.selectedSeriesId;
    this.carsService.retrieveAllCarSeriesModels(this.seriesId).subscribe((data: CarModels[]) => {
      this.modelList = data;
      // console.log('modelList------------------',this.modelList);
    });
  }
  //get modell id
  public getModelId(event: any) {
    this.selectedModelId = event.target.value;
    //console.log('selected modelID---------------',this.selectedModelId);
    this.getCarAccessories();
    this.getCarColors();
  }
  //get car accessories
  getCarAccessories() {
    this.carsService.retrieveAllCarAccessories(this.selectedModelId).subscribe((data: Accessories[]) => {
      this.accessoriesList = data;
      console.log(this.accessoriesList);
    });
  }
  //get colors
  getCarColors() {
    this.carsService.retreiveAllCarColors(this.selectedModelId).subscribe((data: Colors[]) => {
      this.colorsList = data;
      console.log(this.colorsList);
    });
  }
  //get selected accessories
  onAccessSelect(event: any) {
    //  console.log('onAccessSelect', event);
    this.accyObj = event;
    this.arrayAccessories = Converter.convertObjectToArray(event);
    this.setAccessoryDto();
    this.accessPriceCalculation(this.arrayAccessories[0].accessories_id);
  }
  //Deselect accessories
  onAccessDeSelect(event: any) {
    // console.log('onDeSelectAccessortItem', event);
    this.accyObj = event;
    this.isDeSelectedAccessory = true;
    this.arrayAccessories = Converter.convertObjectToArray(event);
    this.setAccessoryDto();
    this.accessPriceDeCalculation(this.arrayAccessories[0].accessories_id);
    return this.arrayAccessories;
  }
  //Trasfer selected accessory to List
  setAccessoryDto() {
    if (this.isDeSelectedAccessory) {
      const index = this.AccessoryIdList.indexOf(this.accyObj);
      this.AccessoryIdList.splice(index, 1);
    }
    else {
      this.AccessoryIdList.push(this.accyObj);
    }
    console.log(this.AccessoryIdList);
  }
  //calculate accessory price
  accessPriceCalculation(aid: number) {
    for (var i = 0; i < this.accessoriesList.length; i++) {
      console.log(this.accessoriesList[i].accessories_id);
      if (this.accessoriesList[i].accessories_id == aid) {
        this.accessPrice1 = this.accessPrice1 + this.accessoriesList[i].accessories_price;
      }
      else {
      }
    }
    this.calculateTotalPrice();
  }
  //decalculate accessory price
  accessPriceDeCalculation(aid: number) {
    for (var i = 0; i < this.accessoriesList.length; i++) {
      if (this.accessoriesList[i].accessories_id == aid) {
        const index = this.AccessoryIdList.indexOf(aid);
        this.accessPrice1 = this.accessPrice1 - this.accessoriesList[i].accessories_price;
      }
    }
    this.calculateTotalPrice();
  }
  //get selected color
  onColorSelect(event: any) {
    // console.log('Selectcolor',item);
    //console.log(item);
    this.colorObj = event;
    console.log('onSelectColorItem', event);
    this.arrayColors = Converter.convertObjectToArray(event);
    this.setColorDto();
    //console.log('colorselect',colorSelect[0].colors_id);
    this.colorPriceCalculation(this.arrayColors[0].colors_id);
    this.calculateTotalPrice();
    return this.arrayColors;
  }
  //deselect selected color
  onColorDeSelect(event: any) {
    // console.log('deSelectcolor',item);
    console.log('onDeSelectnumber', event);
    this.arrayColors = Converter.convertObjectToArray(event);
    this.isDeselectedColor = true;
    this.setColorDto();
    this.colorPriceDeCalculation(this.arrayColors[0].colors_id);
    return this.arrayColors;
  }
  //transfer colors to colors List
  setColorDto() {
    if (this.isDeselectedColor) {
      let index = this.colorIdList.indexOf(this.colorObj);
      this.colorIdList.splice(index, 1);
    }
    else {
      this.colorIdList.push(this.colorObj);
    }
    console.log(this.colorIdList);
  }
  //calculate color price calculation
  colorPriceCalculation(cid: number) {
    for (var i = 0; i < this.colorsList.length; i++) {
      if (this.colorsList[i].colors_id == cid) {
        this.colorPrice1 = this.colorPrice1 + this.colorsList[i].colors_price;
        console.log(this.colorPrice1);
      }
    }
    this.calculateTotalPrice();
  }
  //decalculate color price
  colorPriceDeCalculation(cid: number) {
    for (var i = 0; i < this.colorsList.length; i++) {
      if (this.colorsList[i].colors_id == cid) {
        const index = this.colorIdList.indexOf(cid);
        this.colorPrice1 = this.colorPrice1 - this.colorsList[i].colors_price;
        console.log(this.colorPrice1);

      }
    }
    this.calculateTotalPrice();
  }
 //calculate total price
  calculateTotalPrice() {
    this.totalPrice = this.modelPrice1 + this.accessPrice1 + this.colorPrice1;
  }
  onSubmit() {
    this.calculateTotalPrice();
    let rp = new SaveData();
    rp.seriesId = this.seriesId;
    rp.modelId = this.selectedModelId;
    rp.price = this.totalPrice;
    rp.accessoriesSelect = this.AccessoryIdList;
    rp.colorsSelect = this.colorIdList;
    console.log(rp);
    console.log('price:', this.totalPrice);
    this.carsService.saveOrder(rp).subscribe(data => {
      console.log(data);
    })
    this.success = "Your Order has been Created Successfully";
    console.log(this.success);
  }

}
