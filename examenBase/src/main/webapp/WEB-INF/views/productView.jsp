<%@ include file="/common/taglibs.jsp"%>
<form:form commandName="TODO">		

	<table border="0" align="center">
		<tr>
			<td>&nbsp;</td>
			<td><label>Producto</label></td>
			<td>&nbsp;</td>
		</tr>
		<tr valign="top">
			<td>&nbsp;</td>
			<td>
				<table>						
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>	
					<tr>					
						<td>&nbsp;</td>		
						<td><label>Nombre:</label></td>
						<td><form:input path="TODO" maxlength="50"/></td>
						<td><form:errors path="TODO"/></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>Tipo:</td>
						<td>
							<form:select path="TODO">
								<form:options items="${categoriesTypes}" itemLabel="TODO" itemValue="TODO"/>										
							</form:select>
						</td>	
						<td>&nbsp;</td>							
					</tr>		
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>			
					<tr>	
						<td>&nbsp;</td>						
						<td><label>Código:</label></td>
						<td><form:input path="TODO" maxlength="20"/></td>
						<td><form:errors path="TODO"/></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>							  				
					<tr>
						<td>&nbsp;</td>
						<td><label>Descripción:</label></td>
						<td><form:textarea path="TODO" cols="30" rows="5" ></form:textarea></td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><label>Precio:</label></td>
						<td><form:input path="TODO" maxlength="8"/></td>
						<td><form:errors path="TODO"/></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td align="right">
							<input type="submit" id="Guardar" name="Guardar" value="Guardar"/>
						</td>
						<td align="left">
							<c:if test="${not empty product.idProduct }">
									<input type="button" id="Eliminar" name="Eliminar" 
											onclick="location.href='<c:url value="/TODO?idProduct=${product.idProduct}"/>'"
											value="Eliminar"/>									
							</c:if>		
							<input type="button" id="Cancelar" name="Cancelar" 
									onclick="location.href='<c:url value="/TODO"/>'"
									value="Cancelar"/>		
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>		
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>	
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>																																																																																																											
				</table>
			</td>
			<td>&nbsp;</td>									
		</tr>		
	</table>	
</form:form>				