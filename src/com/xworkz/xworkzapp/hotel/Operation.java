package com.xworkz.xworkzapp.hotel;

public class Operation {

	
	public HotelDTO[] hotelDTOs;
	
	public int index;
	
	
	
	public Operation(int size)
	{
		hotelDTOs = new HotelDTO[size];
	}
	
	
	public void addHotelDetails(HotelDTO hotelDTO)
	{
		System.out.println("Adding all hotel details");
		hotelDTOs[index++]=hotelDTO;
		System.out.println("Added all hotel details");
	}
	
	public void showAllHotelDetails()
	{
		for(HotelDTO hotelDTO:hotelDTOs)
		{
			if(hotelDTO!=null)
			{
				System.out.println(hotelDTO.getName()+" "+hotelDTO.getLocation()+" "+hotelDTO.getOwnerName()+" "+hotelDTO.getType()+" "+hotelDTO.getService()+" "+hotelDTO.getFoodItems());
			}
			else
			{
				System.out.println("please add hotel details");
			}
		}
	}
	
	
	public void searchHotelDetailsByLocation()
	{
		if(HotelDTO hotelDTO :hotelDTOs)
		{
			if(hotelDTO!=null)
			{
				if(hotelDTO.getName().equals(location))
				{
					System.out.println(hotelDTO.getLocation());
				}
				else
				{
					System.out.println("Location not found");
				}
			}
			System.out.println("please add hotel details");
		}
	}

	
	public int returnHotelDetailsByName()
	{
		if(HotelDTO hotelDTO :hotelDTOs)
		{
			if(hotelDTO!=null)
			{
				if(hotelDTO.getName().equals(name))
				{
					System.out.println(hotelDTO.getName());
				}
				else
				{
					System.out.println("owner name not found");
				}
			}
			System.out.println("please add hotel details");
			return ownerName;
		}
	}


		
}	

