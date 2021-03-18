<div class="card col-12 mb-1">

			<div style="cursor: pointer;">
				<h5 class="box-title">
					<i class="fas fa-user-alt" style="font-style:20px; color: #aa6122; padding-top: 10px;"></i>
					<label style="color: #aa6122;padding-left: 10px; padding-top: 10px;">Guest Profile</label>
				</h5>	 
            </div>
<div class="row">
		<div class="form-group col-1.5 ml-2">
			<label for="title">Title</label> 
			<select name="title" id="title"	class="form-control">
				<option ></option>
				<option value="1">Mr</option>
				<option value="2">Mrs</option>
				<option value="3">Miss</option>
				<option value="4">Dr</option>
				<option value="5">Prof</option>
				<option value="6">Engg</option>
			</select>
		</div>
		<div class="form-group col-md-3 ml-2">
			<label  class="form-label" for="firstName">First Name </label> <input type="text"
				id="firstName" name="firstName" 
				class="form-control" />
		</div>

		<div class="form-group col-md-3">
			<label for="middlename">Middle Name</label> <input type="text"
				name="middlename"  class="form-control" />
		</div>

		<div class="form-group col-2.5 md-3">
			<label for="lastname">Last Name</label> <input type="text"
				name="lastname" class="form-control" />
		</div>
				
</div>
<div class="row">
				<div class="col-3">
					<div class="form-group">
					<label class="myfont" class="padding-left:3px">Birth Date</label> 
					<input id="age" name="age" class="form-control" type="date" >
				</div>
				</div>
				<div class="col-1">
				<div class="form-group">
					<label class="form-label" class="padding-left:3px">Age</label> 
					<input id="age" name="age" type="number"class="form-control" min="1" max="100">
				</div>
			</div>
			<div class="col-2">
				<div class="form-label ">Civil Status
				<select id="civilStatus" name="civilStatus" class="form-control ">
                  	<option></option>
                    <option value="1">Married</option>
                    <option value="2">Unmarried</option>
                    <option value="3">Divorced</option>
	             </select>
                </div>
            </div>
            <div class="col-2">
				<div class="form-group">
					<label class="form-label">Contact Number</label> 
					<input id="contactNumber" name="contactNumber" class="form-control">
				</div>
			</div>
			 <div class="col-2">
				<div class="form-group">
					<label class="form-label">Nationality</label> 
					<input id="nationality" name="nationality" class="form-control">
				</div>
			</div>
</div>
         
         	<div class="row"> 
				<div class="form-group col-3">
           			<label>Address</label>
            		<textarea class="form-control" rows="3" placeholder="Enter ..."></textarea>
            	</div>
			<div class="col">
           	<div class="row">
					<div class="form-group col-3">
						<label for="firstName">City</label>
						<input type="text" id="firstName" name="firstName" class="form-control" />
					</div> 
					<div class="form-group col-3">
						<label for="middlename">State</label>
						<input type="text" name="middlename"  class="form-control" />
					</div> 
					<div class="form-group col-3">
						<label for="lastname">Country</label>
						<input type="text" name="lastname" class="form-control" />
					</div>
			</div>
			<div class="row">
					<div class="col-2 ml-5">
						<label for="maleRadioBtn"></label>
                    	<input class="form-check-input" type="radio" value="1" id="maleRadio" name="gender">
                   		<label class="form-check-label form-label ">Male</label>
                    </div>
        			<div class="col-2">
						<label for="femaleRadioBtn"></label>
                    	<input class="form-check-input" type="radio" value="0" id="femaleRadio" name="gender">
                   		<label class="form-check-label form-label">Female</label>
                    </div>
				</div> 
			</div>
		</div>
         
         
         
      <div class="row">
         <div class="col-2">
         		<div class="form-label">Nationality ID Type
                  <select class="form-control select2-container--default select2-danger select2-results__option--highlighted select2-danger select2-container--default select2-results__option--highlighted" id="nationalityIdType" name="nationalityIdType">
                  	<option></option>
                    <option>Iqama</option>
                    <option>PassPort</option>
                    <option>Aadhar</option>
                    <option>PAN</option>
	             </select>
                </div>
             </div>
             <div class="col-2">
				<div class="form-group">
					<label class="form-label">ID Number</label> 
					<input id="idNumber" name="idNumber" class="form-control">
				</div>
			</div>
			<div class="col-2">
				<div class="form-label">Is Contract
				<select id="isContract" name="isContract" class="form-control ">
                  	<option></option>
                    <option value="1">Contract 1</option>
                    <option value="2">Contract 3</option>
                    <option value="3">Contract 3</option>
	             </select>
                </div>
            </div>
			<div class ="col-3">
				<div class="form-group">
                    <label class="form-label ">Attach File</label>
                     <div class="custom-file">
                        <input type="file" class="custom-file-input form-control" id="attachment">
                        <label class="custom-file-label">Choose file</label>
                      </div>
                      
                </div>
            </div>  
            <div class=" col-2 mt-4">
            <button type="submit"  class="btn aa6122" data-dismiss="modal">Next</button>
            </div>         		
       </div>
       			
          		
       

</div>