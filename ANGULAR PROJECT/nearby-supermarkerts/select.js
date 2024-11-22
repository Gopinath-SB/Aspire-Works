function handleLocationFormSubmit()
{
  const locationForm = document.forms['location-form']['location-select']
  location.href = locationForm.value
}
