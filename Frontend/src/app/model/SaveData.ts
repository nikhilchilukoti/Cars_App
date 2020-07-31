
export class AccessoryEntity{
    accessoryId:number;
}

export class ColorEntity{
    colorId:number;
}


export class SaveData{
    seriesId:number;
    modelId:number;
    price:number;
    accessoriesSelect:AccessoryEntity[];
    colorsSelect:ColorEntity[];
}